package br.com.eagravos.mobile.daos;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.eagravos.mobile.modelos.SonoFadiga;

public class SonoFadigaDAO extends GenericDb4oDAO<SonoFadiga>{

	@Override
	protected Query getQueryToUniqueObject(SonoFadiga model, ObjectContainer db) {
		Query query=db.query();
		query.constrain(SonoFadiga.class);
		query.descend("id").constrain(model.getId());
		
		return query;
	}

}
