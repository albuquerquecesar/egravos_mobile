package br.com.eagravos.mobile.daos;



import br.com.eagravos.mobile.exceptions.ManyObjectFoundException;
import br.com.eagravos.mobile.exceptions.NoUniqueObjectException;
import br.com.eagravos.mobile.exceptions.NotFoundObjectException;
import br.com.eagravos.mobile.exceptions.SaveException;
import br.com.eagravos.mobile.exceptions.UpdateException;
import br.com.eagravos.mobile.modelos.Usuarios;
import com.db4o.ObjectContainer;
import com.db4o.query.Query;

public class UsuarioDAO extends GenericDb4oDAO<Usuarios> {

	private static UsuarioDAO instance;

	private UsuarioDAO() {

	}

	public static UsuarioDAO getInstance() {
		if (instance == null) {
			instance = new UsuarioDAO();
		}
		return instance;
	}

	@Override
	protected boolean update(Usuarios modelReceived, ObjectContainer db)
			throws UpdateException, ManyObjectFoundException,
			NotFoundObjectException {
		Usuarios usuarioRetrieved = this.find(modelReceived, db);
		
		return this.update(usuarioRetrieved, modelReceived, db);
	}

	@Override
	protected boolean update(Usuarios modelRetrieved, Usuarios modelReceived,
			ObjectContainer db) throws UpdateException,
			ManyObjectFoundException, NotFoundObjectException{

		modelRetrieved.copyAttributesOf(modelReceived);
		db.store(modelRetrieved);

		return true;
	}

	@Override
	protected boolean save(Usuarios model, ObjectContainer db,
			boolean checkExists) throws SaveException,
			ManyObjectFoundException, NoUniqueObjectException {
		if (checkExists) {
			if (this.exists(model, db)) {

				throw new NoUniqueObjectException("Usuário " + model.label()
						+ " já está cadastrado!");
			}
		}
		db.store(model);
		return true;

	}

	@Override
	protected Query getQueryToUniqueObject(Usuarios model, ObjectContainer db) {
		// TODO Auto-generated method stub
		Query query = db.query();
		query.constrain(Usuarios.class);
		query.descend("id").constrain(model.getId()).equal();

		return query;
	}

  

}
