package br.com.eagravos.mobile.daos;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.eagravos.mobile.modelos.NaturezaOcupacaoRelacionadaSetorTransporte;

public class NaturezaOcupacaoRelacionadaSetorTransporteDAO extends GenericDb4oDAO<NaturezaOcupacaoRelacionadaSetorTransporte>{

	@Override
	protected Query getQueryToUniqueObject(
			NaturezaOcupacaoRelacionadaSetorTransporte model, ObjectContainer db) {
		Query query=db.query();
		query.constrain(NaturezaOcupacaoRelacionadaSetorTransporte.class);
		query.descend("id").constrain(model.getId());
		
		return query;
	}

}
