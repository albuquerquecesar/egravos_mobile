package br.com.eagravos.mobile.daos;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.eagravos.mobile.modelos.EvolucaoDaVitima;

public class EvolucaoDaVitimaDAO extends GenericDb4oDAO<EvolucaoDaVitima>{

	@Override
	protected Query getQueryToUniqueObject(EvolucaoDaVitima model,
			ObjectContainer db) {
		Query query=db.query();
		query.constrain(EvolucaoDaVitima.class);
		query.descend("id").constrain(model.getId());		
		return query;
	}

}
