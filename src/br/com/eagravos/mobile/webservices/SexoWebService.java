package br.com.eagravos.mobile.webservices;

import org.json.JSONException;
import org.json.JSONObject;

import br.com.eagravos.mobile.modelos.Sexo;

public class SexoWebService extends BaseWebService<Sexo> {

	@Override
	protected String getResourceId() {
		
		return "webServiceSexo";
	}

	@Override
	protected String getModelName() {
		// TODO Auto-generated method stub
		return "Sexo";
	}

	@Override
	protected Sexo getModel(JSONObject jsonObject) throws JSONException {
		if (jsonObject!= null){
			return new Sexo(jsonObject);
		}
		return null;
	}

	@Override
	protected String getKeyModel() {
		// TODO Auto-generated method stub
		return "sexo";
	}

}
