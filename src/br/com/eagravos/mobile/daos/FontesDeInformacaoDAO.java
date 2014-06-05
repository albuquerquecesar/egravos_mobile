package br.com.eagravos.mobile.daos;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.eagravos.mobile.modelos.FontesDeInformacao;

public class FontesDeInformacaoDAO extends GenericDb4oDAO<FontesDeInformacao>{

	@Override
	protected Query getQueryToUniqueObject(FontesDeInformacao model,
			ObjectContainer db) {
		Query query=db.query();
		query.constrain(FontesDeInformacao.class);
		query.descend("id").constrain(model.getId());
		
		return query;
	}

}
