package br.com.eagravos.mobile.webservices;

import org.json.JSONException;
import org.json.JSONObject;

import br.com.eagravos.mobile.modelos.FichaGeolocalizacaoAcidente;

public class FichaGeolocalizacaoAcidenteWebservice extends
		BaseWebService<FichaGeolocalizacaoAcidente> {

	@Override
	protected String getResourceId() {

		return "webServiceFichaGeolocalizacaoAcidente";
	}

	@Override
	protected String getModelName() {
		// TODO Auto-generated method stub
		return "FichaGeolocalizacaoAcidente";
	}

	@Override
	protected FichaGeolocalizacaoAcidente getModel(JSONObject jsonObject)
			throws JSONException {
		if (jsonObject != null) {
			return new FichaGeolocalizacaoAcidente(jsonObject);
		}
		return null;
	}

	@Override
	protected String getKeyModel() {
		// TODO Auto-generated method stub
		return "fichaGeolocalizacaoAcidente";
	}

}
