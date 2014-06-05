package br.com.eagravos.mobile.daos;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;


import br.com.eagravos.mobile.modelos.CondutorHabilitado;

public class CondutorHabilitadoDAO extends GenericDb4oDAO<CondutorHabilitado>{

	@Override
	protected Query getQueryToUniqueObject(CondutorHabilitado model,
			ObjectContainer db) {
		Query query=db.query();
		query.constrain(CondutorHabilitado.class);
		query.descend("id").constrain(model.getId());		
		return query;
	}

}
