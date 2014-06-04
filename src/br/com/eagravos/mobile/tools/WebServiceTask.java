package br.com.eagravos.mobile.tools;

import java.util.Collection;
import java.util.List;


import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Button;
import br.com.eagravos.mobile.R;
import br.com.eagravos.mobile.interfaces.IDAO;
import br.com.eagravos.mobile.item.Sincronizacao;
import br.com.eagravos.mobile.webservices.BaseWebService;

public class WebServiceTask extends AsyncTask<Void, String, Boolean> {

	private static final String TAG = "eagravosMobile";

	private final Context context;
	private ProgressDialog progresso;
	private Throwable exceptionErro;
	private int limite = 50;
	private Collection<Sincronizacao> sincronizacoes;

	public WebServiceTask(Context context,
			Collection<Sincronizacao> sincronizacoes) {
		super();
		this.context = context;
		this.sincronizacoes = sincronizacoes;
	}

	public WebServiceTask(Context context,
		Collection<Sincronizacao> sincronizacoes, int limite) {
		super();
		this.context = context;
		this.sincronizacoes = sincronizacoes;
		this.limite = limite;
	}

	@Override
	protected void onPreExecute() {
		// TODO Auto-generated method stub
		super.onPreExecute();
		this.openProgress();
	}

	@Override
	protected Boolean doInBackground(Void... params) {
		try {
			if (this.sincronizacoes == null ? false : !this.sincronizacoes
					.isEmpty()) {
				for (Sincronizacao sincronizacao : this.sincronizacoes) {
					//mensagem a ser exibida
					String message="Sincronizando "+sincronizacao.getNameModel();
					//inicia a barra de progresso
					this.publishProgress("0",message);
					this.busque(sincronizacao.getDao(),
							sincronizacao.getBaseWebService(),
							message);

				}
				this.publishProgress("100","Sincronização terminada");
			}
		} catch (Throwable e) {
			Log.e(TAG, e.getMessage(), e);
			this.exceptionErro = e;
			return false;
		} finally {
		}
		return true;
	}

	public void busque(IDAO dao, BaseWebService web, String message) throws Exception {
		if (web != null) {
			// faz a primeira busca
			List list = web.getAll(this.limite, 0);
			int buscados = 0;
			String[] values = new String[2];

			// verifica se veio resultados
			if (list == null ? false : !list.isEmpty()) {
				dao.merge(list);
				buscados = list.size();

				// atualiza o progress
				this.publishProgress(
						"" + (int) (buscados * 100) / web.getTotal(), message);

				for (int offset = this.limite; buscados < web.getTotal(); offset += this.limite) {
					list = web.getAll(this.limite, offset);
					
					//verifica se veio resultados
					if (list == null ? false : !list.isEmpty()) {
						//salva os dados
						dao.merge(list);
						this.publishProgress(
								"" + (int) (buscados * 100) / web.getTotal(),
								message);
						//incrementa a quantidade buscada
						buscados += list.size();
					} else {
						//não veio nada, então deve parar a execução
						this.publishProgress("" + 100, message);
						break;
					}
				}
				this.publishProgress("" + 100, message);
			}
		}
	}

	@Override
	protected void onPostExecute(Boolean result) {
		// TODO Auto-generated method stub
		if (result) {
			if (this.progresso != null) {
				Button btn = this.progresso.getButton(DialogInterface.BUTTON1);
				if (btn != null) {
					btn.setEnabled(true);
				}
			}
		} else {
			AndroidUtils.alertDialog(this.context, "Erro: "
					+ this.exceptionErro.getMessage());
		}
	}

	private void openProgress() {
		try {
			this.progresso = new ProgressDialog(this.context);
			this.progresso.setMessage(this.context.getString(R.string.aguarde));
			this.progresso.setTitle(this.context.getResources().getString(
					R.string.processando));

			this.progresso.setIndeterminate(false);
			this.progresso.setMax(100);
			this.progresso.setCancelable(false);
			this.progresso.setButton(
					this.context.getString(R.string.concluido),
					new DialogInterface.OnClickListener() {

						@Override
						public void onClick(DialogInterface dialog, int which) {
							dialog.dismiss();

						}
					});
			this.progresso.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
			this.progresso.show();

			Button btn = this.progresso.getButton(DialogInterface.BUTTON1);
			if (btn != null) {
				btn.setEnabled(false);
			}
		} catch (Throwable e) {
			Log.e(TAG, e.getMessage(), e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.os.AsyncTask#onProgressUpdate(Progress[])
	 */
	@Override
	protected void onProgressUpdate(String... values) {
		// TODO Auto-generated method stub
		super.onProgressUpdate(values);
		this.progresso.setProgress(Integer.parseInt(values[0]));
		this.progresso.setMessage(values[1]);
	}

}
