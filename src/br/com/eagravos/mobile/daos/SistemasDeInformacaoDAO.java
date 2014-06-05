package br.com.eagravos.mobile.daos;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.eagravos.mobile.modelos.SistemasDeInformacao;

public class SistemasDeInformacaoDAO extends GenericDb4oDAO<SistemasDeInformacao>{

	@Override
	protected Query getQueryToUniqueObject(SistemasDeInformacao model,
			ObjectContainer db) {
		Query query=db.query();
		query.constrain(SistemasDeInformacao.class);
		query.descend("id").constrain(model.getId());
		
		return query;
	}

}
