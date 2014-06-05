package br.com.eagravos.mobile.daos;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.eagravos.mobile.modelos.InstituicaoTb;

public class InstituicaoTbDAO extends GenericDb4oDAO<InstituicaoTb> {

	@Override
	protected Query getQueryToUniqueObject(InstituicaoTb model,
			ObjectContainer db) {
		Query query=db.query();
		query.constrain(InstituicaoTb.class);
		query.descend("id").constrain(model.getId());
		
		return query;
	}

}
