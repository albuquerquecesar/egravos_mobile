package br.com.eagravos.mobile.daos;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.eagravos.mobile.modelos.Sexo;

public class SexoDAO extends GenericDb4oDAO<Sexo>{

	@Override
	protected Query getQueryToUniqueObject(Sexo model, ObjectContainer db) {
		Query query=db.query();
		query.constrain(Sexo.class);
		query.descend("id").constrain(model.getId());
		
		return query;
	}

}
