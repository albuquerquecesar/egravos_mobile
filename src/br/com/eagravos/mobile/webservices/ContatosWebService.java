package br.com.eagravos.mobile.webservices;

import br.com.eagravos.mobile.modelos.Contatos;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

import com.db4o.foundation.NotImplementedException;



public class ContatosWebService extends BaseWebService<Contatos>{

	@Override
	protected String getResourceId() {
		
		return "webServiceContato";
	}

	/**
	 * Devolve o usuário com o token preenchido.
	 * Caso ocorra algum erro, devolve null
	 * @param usuario
	 * @return
	 */
	public Contatos login(Contatos usuario) {
		Contatos u=null;
		StringBuilder builder=new StringBuilder(WebServiceTool.HOST);

		builder.append(this.getResourceId());
                builder.append("/contato/");
		builder.append(usuario.getEmail());
                builder.append("/");
		builder.append(usuario.getSenha());
		
		JSONObject obj = WebServiceTool.requestWebService(builder.toString());
		if (obj != null) {
				try {

						u=this.getModel(obj);
				} catch (JSONException e) {
					u = null;
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		return u;
	}
	
	@Override
	protected Contatos getModel(JSONObject jsonObject) throws JSONException {
		
		return new Contatos(jsonObject);
	}

	

	@Override
	protected String getModelName() {
		// TODO Auto-generated method stub
		return "contatos";
	}
}
