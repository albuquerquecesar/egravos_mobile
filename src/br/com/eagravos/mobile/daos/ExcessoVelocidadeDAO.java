package br.com.eagravos.mobile.daos;

import br.com.eagravos.mobile.modelos.ExcessoVelocidade;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

public class ExcessoVelocidadeDAO extends GenericDb4oDAO<ExcessoVelocidade> {

	@Override
	protected Query getQueryToUniqueObject(ExcessoVelocidade model,
			ObjectContainer db) {
		Query query=db.query();
		query.constrain(ExcessoVelocidade.class);
		query.descend("id").constrain(model.getId());		
		return query;
	}

}
