package br.com.eagravos.mobile.daos;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.eagravos.mobile.modelos.MeioDeLocomocaoVitima;

public class MeioDeLocomocaoVitimaDAO extends GenericDb4oDAO<MeioDeLocomocaoVitima>{

	@Override
	protected Query getQueryToUniqueObject(MeioDeLocomocaoVitima model,
			ObjectContainer db) {
		Query query=db.query();
		query.constrain(MeioDeLocomocaoVitima.class);
		query.descend("id").constrain(model.getId());
		
		return query;
	}

}
