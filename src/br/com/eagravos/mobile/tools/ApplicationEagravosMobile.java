package br.com.eagravos.mobile.tools;

import br.com.eagravos.mobile.daos.ContatosDAO;
import br.com.eagravos.mobile.daos.UsuarioDAO;
import br.com.eagravos.mobile.modelos.Contatos;
import br.com.eagravos.mobile.modelos.Usuarios;
import br.com.eagravos.mobile.webservices.ContatosWebService;
import java.util.List;




/**
 * Classe que controla a aplicação como um todo.
 * @author albuquerque
 *
 */
public class ApplicationEagravosMobile {

	public final static String TAG="inspetor digital";
	protected static Contatos usuarioConnected = null;



	/**
	 * Devolve o usuário conectado atualmente na aplicação.
	 * @return the usuarioConnected
	 */
	public static Contatos getConnectedUser() {

		return usuarioConnected;
	}

	/**
	 * Conecta um usuário a aplicação para poder utulizá-la.
	 * Esse método deve ser chamado por uma classe que estenda
	 * AsynTask, pois busca informações na internet, caso não encontre
	 * um usuário localmente.
	 * @param usuario usuário que deseja se conectar
	 * @throws Exception
	 * Quando não possível se conectar ao sistema web do inspetor digital ou
	 * o o login foi negado no inspetor digital web ou ainda o login local não foi realizado
	 */
	public static boolean connectUser(Contatos usuario) throws Exception {
		//Verifica se o usuário passado não é nulo
		if (usuario != null) {
			//Verifica se não existe um usuário já conectado, caso exista verifica se o
			//usuário que está tentando se conectar não é igual ao que está conectado.
			if (ApplicationEagravosMobile.usuarioConnected == null ? true
					: !ApplicationEagravosMobile.usuarioConnected.equals(usuario)) {
				// busca o toke do usuário no sistema
				Contatos user = new ContatosWebService().login(usuario);
				if (user != null) {
					// verifica o token
					if (user.getSenha() == null ? false : !user.getSenha()
							.isEmpty()) {
						// apaga todos os usuários existentes no banco de daods
						if (ContatosDAO.getInstance().deleteAll()) {
							// salva o usuário atual
							if (ContatosDAO.getInstance().save(user,false)) {

								ApplicationEagravosMobile.usuarioConnected = user;
								return true;
							}
						}
						throw new Exception(
								"Ops! impossível fazer o login no aplicativo!");

					} else {
						throw new Exception(
								"Não foi possível realizar o login no sistema web do Inspetor Digital!");
					}
				} else {
					throw new Exception(
							"Não foi possível conectar-se ao sistema web do Inspetor Digital");
				}
			}
		}
		return false;
	}

	/**
	 * Desconecta o usuário atual. Ou seja,
	 * deleta do banco de dados.
	 * @return
	 */
	public static boolean desconnect() {
		try {
			if (UsuarioDAO.getInstance().deleteAll()) {
				ApplicationEagravosMobile.usuarioConnected = null;
				return true;
			}
			return false;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
	
	/**
	 * Busca o usuário conectado.
	 * Só existe somente um usuário conectado salvo
	 * no banco de dados
	 */
	private static void findConnectedUser(){
		 List<Contatos> usuarios=ContatosDAO.getInstance().findAll();
		 if (!usuarios.isEmpty()){
		 usuarioConnected=usuarios.get(0);
		 }
	}
}
