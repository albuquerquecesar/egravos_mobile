package br.com.eagravos.mobile.daos;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.eagravos.mobile.modelos.UsoCapacete;

public class UsoCapaceteDAO extends GenericDb4oDAO<UsoCapacete> {

	@Override
	protected Query getQueryToUniqueObject(UsoCapacete model, ObjectContainer db) {
		Query query=db.query();
		query.constrain(UsoCapacete.class);
		query.descend("id").constrain(model.getId());
		
		return query;
	}

}
