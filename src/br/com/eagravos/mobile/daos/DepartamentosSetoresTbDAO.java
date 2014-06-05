package br.com.eagravos.mobile.daos;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.eagravos.mobile.modelos.DepartamentosSetoresTb;

public class DepartamentosSetoresTbDAO extends GenericDb4oDAO<DepartamentosSetoresTb>{

	@Override
	protected Query getQueryToUniqueObject(DepartamentosSetoresTb model,
			ObjectContainer db) {
		Query query=db.query();
		query.constrain(DepartamentosSetoresTb.class);
		query.descend("id").constrain(model.getId());
		
		return query;
	}

}
