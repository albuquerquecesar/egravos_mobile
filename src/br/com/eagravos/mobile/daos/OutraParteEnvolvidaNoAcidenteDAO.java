package br.com.eagravos.mobile.daos;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.eagravos.mobile.modelos.OutraParteEnvolvidaNoAcidente;

public class OutraParteEnvolvidaNoAcidenteDAO extends GenericDb4oDAO<OutraParteEnvolvidaNoAcidente>{

	@Override
	protected Query getQueryToUniqueObject(OutraParteEnvolvidaNoAcidente model,
			ObjectContainer db) {
		Query query=db.query();
		query.constrain(OutraParteEnvolvidaNoAcidente.class);
		query.descend("id").constrain(model.getId());
		
		return query;
	}

}
