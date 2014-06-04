/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.eagravos.mobile.daos;

import br.com.eagravos.mobile.exceptions.ManyObjectFoundException;
import br.com.eagravos.mobile.exceptions.NoUniqueObjectException;
import br.com.eagravos.mobile.exceptions.NotFoundObjectException;
import br.com.eagravos.mobile.exceptions.SaveException;
import br.com.eagravos.mobile.exceptions.UpdateException;
import br.com.eagravos.mobile.modelos.Contatos;
import br.com.eagravos.mobile.modelos.Usuarios;
import com.db4o.ObjectContainer;
import com.db4o.query.Query;
/**
 *
 * @author barbosa
 */
public class ContatosDAO extends GenericDb4oDAO<Contatos> {
       
       private static ContatosDAO instance;
       
       public ContatosDAO(){
       }
       
        public static ContatosDAO getInstance() {
		if (instance == null) {
			instance = new ContatosDAO();
		}
		return instance;
	}

    

	@Override
	protected boolean update(Contatos modelReceived, ObjectContainer db)
			throws UpdateException, ManyObjectFoundException,
			NotFoundObjectException {
		Contatos usuarioRetrieved = this.find(modelReceived, db);
		
		return this.update(usuarioRetrieved, modelReceived, db);
	}

	@Override
	protected boolean update(Contatos modelRetrieved, Contatos modelReceived,
			ObjectContainer db) throws UpdateException,
			ManyObjectFoundException, NotFoundObjectException{

		modelRetrieved.copyAttributesOf(modelReceived);
		db.store(modelRetrieved);

		return true;
	}

	@Override
	protected boolean save(Contatos model, ObjectContainer db,
			boolean checkExists) throws SaveException,
			ManyObjectFoundException, NoUniqueObjectException {
		if (checkExists) {
			if (this.exists(model, db)) {

				throw new NoUniqueObjectException("Usuário " + model.label()
						+ " já está cadastrado!");
			}
		}
		db.store(model);
		return true;

	}

	@Override
	protected Query getQueryToUniqueObject(Contatos model, ObjectContainer db) {
		// TODO Auto-generated method stub
		Query query = db.query();
		query.constrain(Contatos.class);
		query.descend("id").constrain(model.getId()).equal();

		return query;
	}

       
    
}
