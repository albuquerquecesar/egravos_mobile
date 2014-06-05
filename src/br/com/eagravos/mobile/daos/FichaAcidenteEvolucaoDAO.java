package br.com.eagravos.mobile.daos;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.eagravos.mobile.modelos.FichaAcidenteEvolucao;

public class FichaAcidenteEvolucaoDAO extends GenericDb4oDAO<FichaAcidenteEvolucao>{

	@Override
	protected Query getQueryToUniqueObject(FichaAcidenteEvolucao model,
			ObjectContainer db) {
		Query query=db.query();
		query.constrain(FichaAcidenteEvolucao.class);
		query.descend("fichaAcidenteIdAcidentadoId").constrain(model.getFichaAcidenteIdAcidentadoId()).equal();		
		return query;
	}

}
