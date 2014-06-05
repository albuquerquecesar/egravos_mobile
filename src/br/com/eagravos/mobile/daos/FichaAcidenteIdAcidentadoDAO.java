package br.com.eagravos.mobile.daos;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.eagravos.mobile.modelos.FichaAcidenteIdAcidentado;

public class FichaAcidenteIdAcidentadoDAO extends GenericDb4oDAO<FichaAcidenteIdAcidentado>{

	@Override
	protected Query getQueryToUniqueObject(FichaAcidenteIdAcidentado model,
			ObjectContainer db) {
		
		Query query=db.query();
		query.constrain(FichaAcidenteIdAcidentado.class);
		query.descend("id").constrain(model.getId());
		
		return query;
	}

}
