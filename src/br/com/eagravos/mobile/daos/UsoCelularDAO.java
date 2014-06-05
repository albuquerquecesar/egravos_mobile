package br.com.eagravos.mobile.daos;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.eagravos.mobile.modelos.UsoCelular;

public class UsoCelularDAO extends GenericDb4oDAO<UsoCelular>{

	@Override
	protected Query getQueryToUniqueObject(UsoCelular model, ObjectContainer db) {
		Query query=db.query();
		query.constrain(UsoCelular.class);
		query.descend("id").constrain(model.getId());
		
		return query;
	}

}
