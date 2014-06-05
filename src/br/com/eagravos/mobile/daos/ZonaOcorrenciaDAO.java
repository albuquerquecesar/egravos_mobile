package br.com.eagravos.mobile.daos;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.eagravos.mobile.modelos.ZonaOcorrencia;

public class ZonaOcorrenciaDAO extends GenericDb4oDAO<ZonaOcorrencia>{

	@Override
	protected Query getQueryToUniqueObject(ZonaOcorrencia model,
			ObjectContainer db) {
		Query query=db.query();
		query.constrain(ZonaOcorrencia.class);
		query.descend("id").constrain(model.getId());
		
		return query;
	}

}
