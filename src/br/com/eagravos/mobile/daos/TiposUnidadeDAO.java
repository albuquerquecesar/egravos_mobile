package br.com.eagravos.mobile.daos;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.eagravos.mobile.modelos.TiposUnidade;

public class TiposUnidadeDAO extends GenericDb4oDAO<TiposUnidade>{

	@Override
	protected Query getQueryToUniqueObject(TiposUnidade model,
			ObjectContainer db) {
		Query query=db.query();
		query.constrain(TiposUnidade.class);
		query.descend("id").constrain(model.getId());
		
		return query;
	}

}
