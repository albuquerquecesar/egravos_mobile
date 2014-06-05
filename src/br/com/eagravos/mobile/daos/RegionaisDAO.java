package br.com.eagravos.mobile.daos;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.eagravos.mobile.modelos.Regionais;

public class RegionaisDAO extends GenericDb4oDAO<Regionais>{

	@Override
	protected Query getQueryToUniqueObject(Regionais model, ObjectContainer db) {
		Query query=db.query();
		query.constrain(Regionais.class);
		query.descend("id").constrain(model.getId());
		
		return query;
	}

}
