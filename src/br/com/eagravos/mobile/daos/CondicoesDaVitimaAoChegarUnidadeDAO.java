package br.com.eagravos.mobile.daos;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.eagravos.mobile.modelos.CondicoesDaVitimaAoChegarUnidade;

public class CondicoesDaVitimaAoChegarUnidadeDAO extends GenericDb4oDAO<CondicoesDaVitimaAoChegarUnidade>{

	@Override
	protected Query getQueryToUniqueObject(
			CondicoesDaVitimaAoChegarUnidade model, ObjectContainer db) {
		Query query=db.query();
		query.constrain(CondicoesDaVitimaAoChegarUnidade.class);
		query.descend("id").constrain(model.getId());		
		return query;
	}

}
