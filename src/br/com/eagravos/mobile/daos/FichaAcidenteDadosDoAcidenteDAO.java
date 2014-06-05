package br.com.eagravos.mobile.daos;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.eagravos.mobile.modelos.FichaAcidenteDadosDoAcidente;

public class FichaAcidenteDadosDoAcidenteDAO extends GenericDb4oDAO<FichaAcidenteDadosDoAcidente>{

	@Override
	protected Query getQueryToUniqueObject(FichaAcidenteDadosDoAcidente model,
			ObjectContainer db) {
		Query query=db.query();
		query.constrain(FichaAcidenteDadosDoAcidente.class);
		query.descend("fichaAcidenteIdAcidentadoId").constrain(model.getFichaAcidenteIdAcidentadoId()).equal();		
		return query;
	}

}
