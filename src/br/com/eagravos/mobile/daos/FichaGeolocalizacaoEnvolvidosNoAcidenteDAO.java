package br.com.eagravos.mobile.daos;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.eagravos.mobile.modelos.FichaGeolocalizacaoEnvolvidosNoAcidente;

public class FichaGeolocalizacaoEnvolvidosNoAcidenteDAO extends GenericDb4oDAO<FichaGeolocalizacaoEnvolvidosNoAcidente>{

	@Override
	protected Query getQueryToUniqueObject(
			FichaGeolocalizacaoEnvolvidosNoAcidente model, ObjectContainer db) {
		Query query=db.query();
		query.constrain(FichaGeolocalizacaoEnvolvidosNoAcidente.class);
		query.descend("id").constrain(model.getId());
		
		return query;

	}

}
