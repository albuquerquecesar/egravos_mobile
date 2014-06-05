package br.com.eagravos.mobile.daos;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.eagravos.mobile.modelos.UnidadeNotificadoraDoAcidente;

public class UnidadeNotificadoraDoAcidenteDAO  extends GenericDb4oDAO<UnidadeNotificadoraDoAcidente>{

	@Override
	protected Query getQueryToUniqueObject(UnidadeNotificadoraDoAcidente model,
			ObjectContainer db) {
		Query query=db.query();
		query.constrain(UnidadeNotificadoraDoAcidente.class);
		query.descend("id").constrain(model.getId());
		
		return query;
	}

}
