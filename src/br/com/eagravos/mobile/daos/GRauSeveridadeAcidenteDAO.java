package br.com.eagravos.mobile.daos;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.eagravos.mobile.modelos.GrauSeveridadeAcidente;

public class GRauSeveridadeAcidenteDAO extends GenericDb4oDAO<GrauSeveridadeAcidente> {

	@Override
	protected Query getQueryToUniqueObject(GrauSeveridadeAcidente model,
			ObjectContainer db) {
		Query query=db.query();
		query.constrain(GrauSeveridadeAcidente.class);
		query.descend("id").constrain(model.getId());
		
		return query;
	}

}
