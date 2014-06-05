package br.com.eagravos.mobile.daos;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.eagravos.mobile.modelos.UsoDeBebidaAlcoolica;

public class UsoBebidaAlcoolicaDAO extends GenericDb4oDAO<UsoDeBebidaAlcoolica> {

	@Override
	protected Query getQueryToUniqueObject(UsoDeBebidaAlcoolica model,
			ObjectContainer db) {
		Query query=db.query();
		query.constrain(UsoDeBebidaAlcoolica.class);
		query.descend("id").constrain(model.getId());
		
		return query;
	}

}
