package br.com.eagravos.mobile.webservices;

import org.json.JSONException;
import org.json.JSONObject;

import br.com.eagravos.mobile.modelos.TipoDeVitima;

public class TipoDeVitimaWebService extends BaseWebService<TipoDeVitima>{

	@Override
	protected String getResourceId() {
		// TODO Auto-generated method stub
		return "webServiceTipoVitima";
	}

	@Override
	protected String getModelName() {
		// TODO Auto-generated method stub
		return "TipoVitima";
	}

	@Override
	protected String getKeyModel() {
		// TODO Auto-generated method stub
		return "tipoDeVitima";
	}

	@Override
	protected TipoDeVitima getModel(JSONObject jsonObject) throws JSONException {
		if (jsonObject!= null){
			return new TipoDeVitima(jsonObject);
		}
		return null;
	}

}
