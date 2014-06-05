package br.com.eagravos.mobile.webservices;

import br.com.eagravos.mobile.interfaces.IModel;
import br.com.eagravos.mobile.tools.DateFormat;
import br.com.eagravos.mobile.tools.Filter;
import br.com.eagravos.mobile.tools.Operator;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;



public abstract class BaseWebService<T extends IModel> {

	private int total;
	private int subTotalLastRequest;
	private boolean success = false;

	protected abstract String getResourceId();
	
	protected abstract String getModelName();

	protected abstract T getModel(JSONObject jsonObject) throws JSONException;

	/**
	 * Retorna uma lista de objetos do tipo passado pelo generics. Caso algum
	 * erro ocorra devolve null.
	 * Para pegar todos os registros de uma unica vez, limit e offset devem
	 * ser igual a zero.
	 * @param limit
	 *            quantidade máxima de registros. Obrigatório.
	 * @param offset
	 *            índice para contagem do total de registros. Começa por zero.
	 * @return
	 */
	public List<T> getAll(Integer limit, Integer offset) {

		StringBuilder builder = new StringBuilder(WebServiceTool.HOST);
		//capitaliza o primeiro caractere
		String tmp=(""+this.getModelName().charAt(0)).toUpperCase();
		tmp=tmp+this.getModelName().substring(1);
		
		builder.append("/");
		builder.append(this.getResourceId());
		builder.append("/lista");
		
		builder.append(tmp);

		return this.getAll(builder.toString(), this.getModelName());
	}
	
//	/**
//	 * Retorna uma lista de objetos do tipo passado pelo generics. Caso algum
//	 * erro ocorra devolve null.
//	 * Para pegar todos os registros de uma unica vez, limit e offset devem
//	 * ser igual a zero.
//	 * Pode-se passar uma data para trazer os registros que foram atualizados ou criados
//	 * a partir de uma data.
//	 * @param limit
//	 *            quantidade máxima de registros. Obrigatório.
//	 * @param offset
//	 *            índice para contagem do total de registros. Começa por zero.
//	 * @param dataLastUpdate a data da última atualização ou cadastro dos registros 
//	 * @return
//	 */
//	public List<T> getAll(Integer limit, Integer offset,Date dataLastUpdate){
//		StringBuilder builder = new StringBuilder(WebServiceTool.HOST);
//
//		builder.append("/");
//		builder.append(this.getResourceId());
//		builder.append("/list");
//		if (limit != null && offset != null) {
//			builder.append("/limit/");
//			builder.append(limit);
//			builder.append("/offset/");
//			builder.append(offset);
//		}
//
//		if (dataLastUpdate!= null){
//			builder.append("/filter/[");
//			Filter filter=new Filter("data_atualizacao_registro", DateFormat.getAmericanFormatDatetime(dataLastUpdate),Operator.GREATER_EQUAL);
//			builder.append(filter.toJson());
//			builder.append("]");
//		}
//		return this.getAll(builder.toString(), this.getModelName());
//	}
	
	public T send(T t){
		T model = null;
		try {
		String data=t.JSONFormat();
		
		String url=WebServiceTool.HOST+"/"+this.getResourceId();
		
			JSONObject tmp = WebServiceTool.requestPostWebService(url, data);
			if (tmp!= null){
			
			model=this.getModel(tmp);
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
			model = null;
		}
		finally{
			return model;
		}
	}

	/**
	 * Pega todos os modelos, respeitando a quantidade máxima que a API permite.
	 * Por padrão é 100 registros.
	 * 
	 * @param url
	 * @param model
	 * @return
	 */
	protected List<T> getAll(String url, String model) {

		List<T> list = null;
		try {
			JSONObject tmp = WebServiceTool.requestWebService(url);
			if (tmp!= null){
				try{
					JSONArray array = this.getDataJSONArray(tmp, model);

					if (array != null) {
						list = new ArrayList<T>();
						// pega o total
						for (int i = 0; i < array.length(); i++) {
							list.add(this.getModel(array.getJSONObject(i)));
						}
					}
					//talvez tenha vindo somente um obejto
				}catch(JSONException ex){

					list = new ArrayList<T>();
					list.add(this.getModel(tmp));
				}
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
			list = null;
		}

		return list;
	}

	/**
	 * Pega todos os modelos, respeitando a quantidade máxima que a API permite.
	 * Por padrão é 100 registros.
	 * 
	 * @param url
	 * @return
	 */
//	protected List<T> getAll(String url) {
//
//		return this.getAll(url, this.getModelName());
//	}

	/**
	 * 
	 * @param jsonObject
	 * @param model
	 * @return
	 */
	protected JSONArray getDataJSONArray(JSONObject jsonObject, String model) {
		if (jsonObject != null) {

			try {
				// não houve nenhum erro interno.
				if (jsonObject != null) {
					this.success = true;
					return jsonObject.getJSONArray(model);
				}
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return null;

	}

//	/**
//	 * 
//	 * @param jsonObject
//	 * @param model
//	 * @return
//	 */
//	public JSONObject getDataJSONObject(JSONObject jsonObject, String model) {
//		if (jsonObject != null) {
//
//			try {
//				// não houve nenhum erro interno.
//					this.success = true;
//					return jsonObject.getJSONObject("data")
//							.getJSONObject(model);
//				
//			} catch (JSONException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();//	protected List<T> getAll(String url) {
	//
//	return this.getAll(url, this.getModelName());
//}
//			}
//		}
//
//		return null;
//
//	}

	/**
	 * @return the total
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * @param total
	 *            the total to set
	 */
	protected void setTotal(int total) {
		this.total = total;
	}

	/**
	 * @return the subTotalLastRequest
	 */
	public int getSubTotalLastRequest() {
		return subTotalLastRequest;
	}

	/**
	 * @param subTotalLastRequest
	 *            the subTotalLastRequest to set
	 */
	protected void setSubTotalLastRequest(int subTotalLastRequest) {
		this.subTotalLastRequest = subTotalLastRequest;
	}

}
