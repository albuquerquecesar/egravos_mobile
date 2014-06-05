package br.com.eagravos.mobile.daos;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.eagravos.mobile.modelos.MeioLocomocaoVitimaHoraAcidente;

public class MeioLocomocaoVitimaHoraAcidenteDAO extends GenericDb4oDAO<MeioLocomocaoVitimaHoraAcidente> {

	@Override
	protected Query getQueryToUniqueObject(
			MeioLocomocaoVitimaHoraAcidente model, ObjectContainer db) {
		Query query=db.query();
		query.constrain(MeioLocomocaoVitimaHoraAcidente.class);
		query.descend("id").constrain(model.getId());
		
		return query;
	}

}
