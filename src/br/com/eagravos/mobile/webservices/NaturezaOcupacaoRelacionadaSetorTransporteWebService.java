package br.com.eagravos.mobile.webservices;

import org.json.JSONException;
import org.json.JSONObject;

import br.com.eagravos.mobile.modelos.NaturezaOcupacaoRelacionadaSetorTransporte;

public class NaturezaOcupacaoRelacionadaSetorTransporteWebService extends BaseWebService<NaturezaOcupacaoRelacionadaSetorTransporte>{

	@Override
	protected String getResourceId() {
		// TODO Auto-generated method stub
		return "webServiceNaturezaOcupacao";
	}

	@Override
	protected String getModelName() {
		// TODO Auto-generated method stub
		return "NaturezaOcupacao";
	}

	@Override
	protected String getKeyModel() {
		// TODO Auto-generated method stub
		return "naturezaOcupacaoRelacionadaSetorTransporte";
	}

	@Override
	protected NaturezaOcupacaoRelacionadaSetorTransporte getModel(
			JSONObject jsonObject) throws JSONException {
		if (jsonObject!= null){
			return new NaturezaOcupacaoRelacionadaSetorTransporte(jsonObject);
		}
		return null;
	}

}
