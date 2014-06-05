package br.com.eagravos.mobile.daos;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.eagravos.mobile.modelos.Perfil;

public class PerfilDAO extends GenericDb4oDAO<Perfil> {

	@Override
	protected Query getQueryToUniqueObject(Perfil model, ObjectContainer db) {
		Query query=db.query();
		query.constrain(Perfil.class);
		query.descend("idPerfil").constrain(model.getIdPerfil());
		
		return query;
		
	}

}
