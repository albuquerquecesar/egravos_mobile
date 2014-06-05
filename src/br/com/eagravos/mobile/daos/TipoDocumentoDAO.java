package br.com.eagravos.mobile.daos;

import com.db4o.ObjectContainer;
import com.db4o.query.Query;

import br.com.eagravos.mobile.modelos.TipoDocumento;

public class TipoDocumentoDAO extends GenericDb4oDAO<TipoDocumento>{

	@Override
	protected Query getQueryToUniqueObject(TipoDocumento model,
			ObjectContainer db) {
		Query query=db.query();
		query.constrain(TipoDocumento.class);
		query.descend("id").constrain(model.getId()).equal();
		
		return query;
	}

}
