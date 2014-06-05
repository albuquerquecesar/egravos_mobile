package br.com.eagravos.mobile.daos;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.eagravos.mobile.modelos.AcidenteRelacionadoAoTrabalho;

public class AcidenteRelacionadoAoTrabalhoDAO extends GenericDb4oDAO<AcidenteRelacionadoAoTrabalho> {

	@Override
	protected Query getQueryToUniqueObject(AcidenteRelacionadoAoTrabalho model,
			ObjectContainer db) {
		Query query=db.query();
		query.constrain(AcidenteRelacionadoAoTrabalho.class);
		query.descend("id").constrain(model.getId());		
		return query;
	}

}
