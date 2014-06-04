package br.com.eagravos.mobile.tools;


import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import br.com.eagravos.mobile.R;
import br.com.eagravos.mobile.interfaces.Transaction;

/**
 * 
 * @author albuquerque
 *
 */
public class TransactionTask extends AsyncTask<Void, Void, Boolean>{

	private static final String TAG="inspetordigital";
	private final Context context;
	private final Transaction transaction;
	private ProgressDialog progresso;
	private Throwable exceptionErro;
	private int aguardeMsg;
	
	
	public TransactionTask(Context context, Transaction transaction,
			int aguardeMsg) {
		super();
		this.context = context;
		this.transaction = transaction;
		this.aguardeMsg = aguardeMsg;
	}

	@Override
	protected void onPreExecute() {
		// TODO Auto-generated method stub
		super.onPreExecute();
		this.openProgress();
	}

	@Override
	protected Boolean doInBackground(Void... params) {
		// TODO Auto-generated method stub
		try{
			this.transaction.execute();
		}catch(Throwable e){
			Log.e(TAG, e.getMessage(), e);
			this.exceptionErro=e;
			return false;
		}finally{
			try{
				this.closeProgress();
			}catch(Exception e){
				Log.e(TAG, e.getMessage(), e);
			}
		}
		return true;
	}
	
	@Override
	protected void onPostExecute(Boolean result) {
		// TODO Auto-generated method stub
		if (result){
			transaction.atualizarView();
		}else{
			AndroidUtils.alertDialog(this.context, "Erro: "+this.exceptionErro.getMessage());
		}
	}
	
	private void openProgress(){
		try{
			this.progresso=ProgressDialog.show(this.context, this.context.getResources().getString(R.string.processando), this.context.getString(this.aguardeMsg));
		}catch(Throwable e){
			Log.e(TAG, e.getMessage(),e);
		}
	}
	
	private void closeProgress(){
		try{
			if (this.progresso != null){
				this.progresso.dismiss();
			}
			
		}catch(Throwable e){
			Log.e(TAG, e.getMessage(),e);
		}
	}
	
}
