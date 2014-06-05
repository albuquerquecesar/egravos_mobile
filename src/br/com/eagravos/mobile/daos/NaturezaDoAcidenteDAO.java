package br.com.eagravos.mobile.daos;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.eagravos.mobile.modelos.NaturezaDoAcidente;

public class NaturezaDoAcidenteDAO extends GenericDb4oDAO<NaturezaDoAcidente>{

	@Override
	protected Query getQueryToUniqueObject(NaturezaDoAcidente model,
			ObjectContainer db) {
		Query query=db.query();
		query.constrain(NaturezaDoAcidente.class);
		query.descend("id").constrain(model.getId());
		
		return query;
	}

}
