package br.com.eagravos.mobile.daos;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.eagravos.mobile.modelos.RacaCor;

public class RacaCorDAO extends GenericDb4oDAO<RacaCor>{

	@Override
	protected Query getQueryToUniqueObject(RacaCor model, ObjectContainer db) {
		Query query=db.query();
		query.constrain(RacaCor.class);
		query.descend("id").constrain(model.getId());
		
		return query;
	}

}
