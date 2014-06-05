package br.com.eagravos.mobile.daos;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.eagravos.mobile.modelos.UsoCintoSeguranca;

public class UsoCintoSegurancaDAO  extends GenericDb4oDAO<UsoCintoSeguranca>{

	@Override
	protected Query getQueryToUniqueObject(UsoCintoSeguranca model,
			ObjectContainer db) {
		Query query=db.query();
		query.constrain(UsoCintoSeguranca.class);
		query.descend("id").constrain(model.getId());
		
		return query;
	}

}
