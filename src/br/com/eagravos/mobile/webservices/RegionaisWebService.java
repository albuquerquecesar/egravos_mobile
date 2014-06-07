package br.com.eagravos.mobile.webservices;

import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

import br.com.eagravos.mobile.modelos.Regionais;

public class RegionaisWebService extends BaseWebService<Regionais>{

	@Override
	protected String getResourceId() {
		
		return "webServiceRegional";
	}

	@Override
	protected String getModelName() {
		// TODO Auto-generated method stub
		return "Regionais";
	}

	@Override
	protected Regionais getModel(JSONObject jsonObject) throws JSONException {
		if (jsonObject!= null){
			return new Regionais(jsonObject);
		}
		return null;
	}

	@Override
	protected String getKeyModel() {
		// TODO Auto-generated method stub
		return "regionais";
	}
	
	public List<Regionais> getAll(Integer limit, Integer offset) {

		StringBuilder builder = new StringBuilder(WebServiceTool.HOST);
		
		builder.append("/");
		builder.append(this.getResourceId());
		builder.append("/lista");
		
		builder.append(this.getModelName());
		builder.append("/1");

		return this.getAll(builder.toString(), this.getKeyModel());
	}

}
