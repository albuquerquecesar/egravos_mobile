package br.com.eagravos.mobile.daos;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;


import br.com.eagravos.mobile.modelos.DesrespeitoSemaforo;

public class DesrespeitoSemaforoDAO extends GenericDb4oDAO<DesrespeitoSemaforo>{

	@Override
	protected Query getQueryToUniqueObject(DesrespeitoSemaforo model,
			ObjectContainer db) {
		Query query=db.query();
		query.constrain(DesrespeitoSemaforo.class);
		query.descend("id").constrain(model.getId());		
		return query;
	}

}
