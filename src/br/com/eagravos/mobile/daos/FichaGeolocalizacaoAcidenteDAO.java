package br.com.eagravos.mobile.daos;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.eagravos.mobile.modelos.FichaGeolocalizacaoAcidente;

public class FichaGeolocalizacaoAcidenteDAO extends GenericDb4oDAO<FichaGeolocalizacaoAcidente>{

	@Override
	protected Query getQueryToUniqueObject(FichaGeolocalizacaoAcidente model,
			ObjectContainer db) {
		
		Query query=db.query();
		query.constrain(FichaGeolocalizacaoAcidente.class);
		query.descend("fichaAcidenteIdAcidentadoId").constrain(model.getFichaAcidenteIdAcidentadoId()).equal();
		
		return query;
	}

}
