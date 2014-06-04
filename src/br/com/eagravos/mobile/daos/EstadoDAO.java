package br.com.eagravos.mobile.daos;

import br.com.eagravos.mobile.modelos.Estados;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

public class EstadoDAO extends GenericDb4oDAO<Estados>{

	@Override
	protected Query getQueryToUniqueObject(Estados model, ObjectContainer db) {
		Query query=db.query();
		query.constrain(Estados.class);
		query.descend("id").constrain(model.getId());
		
		return query;
	}


}
