package br.com.eagravos.mobile.daos;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.eagravos.mobile.modelos.UnidadeSaude;

public class UnidadeSaudeDAO extends GenericDb4oDAO<UnidadeSaude>{

	@Override
	protected Query getQueryToUniqueObject(UnidadeSaude model,
			ObjectContainer db) {
		Query query=db.query();
		query.constrain(UnidadeSaude.class);
		query.descend("id").constrain(model.getId());
		
		return query;
	}

}
