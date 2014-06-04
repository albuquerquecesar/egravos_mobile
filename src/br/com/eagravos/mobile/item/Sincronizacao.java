package br.com.eagravos.mobile.item;

import br.com.eagravos.mobile.interfaces.IDAO;
import br.com.eagravos.mobile.webservices.BaseWebService;


public class Sincronizacao {

	private BaseWebService baseWebService;
	private IDAO dao;
	private String nameModel;
	
	public Sincronizacao(BaseWebService baseWebService,
			IDAO dao,String nameModel) {
		super();
		this.baseWebService = baseWebService;
		this.dao = dao;
		this.nameModel=nameModel;
	}

	/**
	 * @return the baseWebService
	 */
	public BaseWebService getBaseWebService() {
		return baseWebService;
	}

	/**
	 * @param baseWebService the baseWebService to set
	 */
	public void setBaseWebService(BaseWebService baseWebService) {
		this.baseWebService = baseWebService;
	}

	/**
	 * @return the dao
	 */
	public IDAO getDao() {
		return dao;
	}

	/**
	 * @param dao the dao to set
	 */
	public void setDao(IDAO genericaDao) {
		this.dao = genericaDao;
	}

	/**
	 * @return the nameModel
	 */
	public String getNameModel() {
		return nameModel;
	}

	/**
	 * @param nameModel the nameModel to set
	 */
	public void setNameModel(String nameModel) {
		this.nameModel = nameModel;
	}
	
	
}
