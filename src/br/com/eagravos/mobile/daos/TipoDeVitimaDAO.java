package br.com.eagravos.mobile.daos;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.eagravos.mobile.modelos.TipoDeVitima;

public class TipoDeVitimaDAO extends GenericDb4oDAO<TipoDeVitima> {

	@Override
	protected Query getQueryToUniqueObject(TipoDeVitima model,
			ObjectContainer db) {
		Query query=db.query();
		query.constrain(TipoDeVitima.class);
		query.descend("id").constrain(model.getId());
		
		return query;
	}

}
