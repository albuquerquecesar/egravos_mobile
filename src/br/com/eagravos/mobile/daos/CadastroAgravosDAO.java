package br.com.eagravos.mobile.daos;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.eagravos.mobile.modelos.CadastroAgravos;

public class CadastroAgravosDAO extends GenericDb4oDAO<CadastroAgravos> {

	@Override
	protected Query getQueryToUniqueObject(CadastroAgravos model,
			ObjectContainer db) {
		Query query=db.query();
		query.constrain(CadastroAgravos.class);
		query.descend("id").constrain(model.getId()).equal();		
		return query;
	}

}
