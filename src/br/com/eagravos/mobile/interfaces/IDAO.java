/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.eagravos.mobile.interfaces;

import br.com.eagravos.mobile.exceptions.ManyObjectFoundException;
import br.com.eagravos.mobile.exceptions.NoUniqueObjectException;
import br.com.eagravos.mobile.exceptions.NotFoundObjectException;
import br.com.eagravos.mobile.exceptions.SaveException;
import br.com.eagravos.mobile.exceptions.UpdateException;
import java.util.List;

/**
 *
 * @author barbosa
 * @param <T>
 */
public interface IDAO<T extends IModel> {

	
public List<T> findAllWithPagination(int limit, int offset);
	
	public int count();
	/**
	 * Armazena um novo objeto no banco de dados.
	 * Pode-se verificar se ela já existe ou não
	 * @param model
	 * @param checkExist caso seja true vai verificar se o objeto existe
	 * @return true se o modelo for armazenado com sucesso
     * @throws br.com.eagravos.mobile.exceptions.SaveException
     * @throws br.com.eagravos.mobile.exceptions.NoUniqueObjectException
     * @throws br.com.eagravos.mobile.exceptions.ManyObjectFoundException
	 */
	public boolean save(T model,boolean checkExist) throws SaveException,NoUniqueObjectException,ManyObjectFoundException;
	
	/**
	 * Aramazena um novo objeto caso ele ainda não exista, caso contrário atualizará-lo.
	 * @param model
	 * @return true se conseguir inserir ou atualizar o objeto
     * @throws br.com.eagravos.mobile.exceptions.SaveException
     * @throws br.com.eagravos.mobile.exceptions.UpdateException
     * @throws br.com.eagravos.mobile.exceptions.NoUniqueObjectException
     * @throws br.com.eagravos.mobile.exceptions.ManyObjectFoundException
	 */
	public boolean merge(T model) throws SaveException,UpdateException,NoUniqueObjectException,ManyObjectFoundException;
	
	/**
	 * Atualiza um objeto caso ele exista
	 * @param model
	 * @return
     * @throws br.com.eagravos.mobile.exceptions.UpdateException
     * @throws br.com.eagravos.mobile.exceptions.NotFoundObjectException
     * @throws br.com.eagravos.mobile.exceptions.ManyObjectFoundException
	 */
	public boolean update(T model) throws UpdateException,NotFoundObjectException,ManyObjectFoundException;
	
	/**
	 * Retorna todos os objetos
	 * @return
	 */
	public List<T> findAll();
	
	/**
	 * Retorna um objeto em específico. 
	 * Caso não seja encontrado retorna null ou se
	 * tiver mais de um objeto que satisfaça a condição lança uma exceção 
	 * @param model
	 * @return 
     * @throws br.com.eagravos.mobile.exceptions.ManyObjectFoundException 
	 */
	public T find(T model) throws ManyObjectFoundException;
	
	public boolean delete(T model);
	
	/**
	 * 
	 * @param model
	 * @return
     * @throws br.com.eagravos.mobile.exceptions.ManyObjectFoundException
	 */
	public T findByHashCode(T model) throws ManyObjectFoundException;
	
	public T findByExemple(T model) throws ManyObjectFoundException;
	
	public List<T> findAll(T model);
	
	public boolean save(List<T> models,boolean checkExist)  throws SaveException,NoUniqueObjectException,ManyObjectFoundException;
	
	public boolean merge(List<T> models) throws SaveException,UpdateException,NoUniqueObjectException,ManyObjectFoundException;
	
	public boolean update(List<T> models) throws UpdateException,NotFoundObjectException,ManyObjectFoundException;
	
	public boolean deleteAll();
	
}
