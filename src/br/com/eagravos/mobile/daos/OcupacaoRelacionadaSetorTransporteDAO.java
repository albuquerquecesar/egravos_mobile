package br.com.eagravos.mobile.daos;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.eagravos.mobile.modelos.OcupacaoRelacionadaSetorTransporte;

public class OcupacaoRelacionadaSetorTransporteDAO extends GenericDb4oDAO<OcupacaoRelacionadaSetorTransporte> {

	@Override
	protected Query getQueryToUniqueObject(
			OcupacaoRelacionadaSetorTransporte model, ObjectContainer db) {
		Query query=db.query();
		query.constrain(OcupacaoRelacionadaSetorTransporte.class);
		query.descend("id").constrain(model.getId());
		
		return query;
	}

}
