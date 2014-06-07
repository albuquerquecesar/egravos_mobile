package br.com.eagravos.mobile.webservices;

import org.json.JSONException;
import org.json.JSONObject;

import br.com.eagravos.mobile.modelos.GrauSeveridadeAcidente;

public class GrauSeveridadeAcidenteWebService extends BaseWebService<GrauSeveridadeAcidente>{

	@Override
	protected String getResourceId() {
		
		return "webServiceGrauSeveridade";
	}

	@Override
	protected String getModelName() {
		// TODO Auto-generated method stub
		return "GrauSeveridade";
	}

	@Override
	protected String getKeyModel() {
		// TODO Auto-generated method stub
		return "grauSeveridadeAcidente";
	}

	@Override
	protected GrauSeveridadeAcidente getModel(JSONObject jsonObject)
			throws JSONException {
		if (jsonObject!= null){
			return new GrauSeveridadeAcidente(jsonObject);
		}
		return null;
	}

}
