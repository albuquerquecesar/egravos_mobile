package br.com.eagravos.mobile.daos;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.eagravos.mobile.modelos.FichaAcidenteIdLocalAtendimento;

public class FichaAcidenteLocalAtendimentoDAO extends GenericDb4oDAO<FichaAcidenteIdLocalAtendimento> {

	@Override
	protected Query getQueryToUniqueObject(
			FichaAcidenteIdLocalAtendimento model, ObjectContainer db) {
		Query query=db.query();
		query.constrain(FichaAcidenteIdLocalAtendimento.class);
		query.descend("numeroRegistro").constrain(model.getId());
		
		return query;
	}
	

}
