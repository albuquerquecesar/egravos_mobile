package br.com.eagravos.mobile.daos;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.eagravos.mobile.modelos.Ano;

public class AnoDAO extends GenericDb4oDAO<Ano>{

	@Override
	protected Query getQueryToUniqueObject(Ano model, ObjectContainer db) {
		Query query=db.query();
		query.constrain(Ano.class);
		query.descend("ano").constrain(model.getAno());		
		return query;
	}

}
