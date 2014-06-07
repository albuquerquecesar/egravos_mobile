package br.com.eagravos.mobile.webservices;

import org.json.JSONException;
import org.json.JSONObject;

import br.com.eagravos.mobile.modelos.OcupacaoRelacionadaSetorTransporte;

public class OcupacaoRelacionadaSetorTransporteWebService extends BaseWebService<OcupacaoRelacionadaSetorTransporte>{

	@Override
	protected String getResourceId() {
		
		return "webServiceOcupacaoRelSetorTransporte";
	}

	@Override
	protected String getModelName() {
		// TODO Auto-generated method stub
		return "OcupacaoRelSetorTransporte";
	}

	@Override
	protected String getKeyModel() {
		// TODO Auto-generated method stub
		return "ocupacaoRelacionadaSetorTransporte";
	}

	@Override
	protected OcupacaoRelacionadaSetorTransporte getModel(JSONObject jsonObject)
			throws JSONException {
		if (jsonObject!= null){
			return new OcupacaoRelacionadaSetorTransporte(jsonObject);
		}
		return null;
	}

}
