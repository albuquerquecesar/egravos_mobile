package br.com.eagravos.mobile.daos;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.eagravos.mobile.modelos.FichaAcidenteFatoresRelacionados;

public class FichaAcidenteFatoresRelacionadosDAO extends GenericDb4oDAO<FichaAcidenteFatoresRelacionados>{

	@Override
	protected Query getQueryToUniqueObject(
			FichaAcidenteFatoresRelacionados model, ObjectContainer db) {
		Query query=db.query();
		query.constrain(FichaAcidenteFatoresRelacionados.class);
		query.descend("fichaAcidenteIdAcidentadoId").constrain(model.getFichaAcidenteIdAcidentadoId());
		
		return query;

	}

}
