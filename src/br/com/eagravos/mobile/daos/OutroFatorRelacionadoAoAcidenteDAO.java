package br.com.eagravos.mobile.daos;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.eagravos.mobile.modelos.OutroFatorRelacionadoAoAcidente;

public class OutroFatorRelacionadoAoAcidenteDAO extends GenericDb4oDAO<OutroFatorRelacionadoAoAcidente>{

	@Override
	protected Query getQueryToUniqueObject(
			OutroFatorRelacionadoAoAcidente model, ObjectContainer db) {
		Query query=db.query();
		query.constrain(OutroFatorRelacionadoAoAcidente.class);
		query.descend("id").constrain(model.getId());
		
		return query;
	}

}
