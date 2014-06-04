package br.com.eagravos.mobile.tools;

/**
 * Formatadores para valores da aplicação.
 * @author albuquerque
 *
 */
public class Formatter {

	/**
	 * Formata um CPF ou CNPJ com pontos, traço e barra.
	 * Exemplo: 09876523412 ==> 098.765.234-12
	 * 			09876523000134 => 09.876.523/0001-34
	 * @param cpfCnpj
	 * @return
	 */
	public static String cpfOrCnpj(String cpfCnpj){
		if (cpfCnpj != null ? !cpfCnpj.isEmpty():false){
			if (cpfCnpj.length() == 11){
				
				StringBuilder builder=new StringBuilder(cpfCnpj.substring(0, 3));
				builder.append(".");
				builder.append(cpfCnpj.substring(3, 6));
				builder.append(".");
				builder.append(cpfCnpj.substring(6, 9));
				builder.append("-");
				builder.append(cpfCnpj.substring(9, 11));
				return builder.toString();
			}
			if (cpfCnpj.length() == 14){
				StringBuilder builder=new StringBuilder(cpfCnpj.substring(0, 2));
				builder.append(".");
				builder.append(cpfCnpj.substring(2, 5));
				builder.append(".");
				builder.append(cpfCnpj.substring(5, 8));
				builder.append("/");
				builder.append(cpfCnpj.substring(8, 12));
				builder.append("-");
				builder.append(cpfCnpj.substring(12, 14));
				return builder.toString();
			}
		}
		return cpfCnpj;
	}
	
	/**
	 * Formata um CEP.
	 * Exemplo: 55380000 ==> 55380-000
	 * @param cep
	 * @return
	 */
	public static String Cep(String cep){
		if (cep != null? !cep.isEmpty():false){
			if(cep.length() == 8){
				StringBuilder builder=new StringBuilder(cep.substring(0, 5));
				builder.append("-");
				builder.append(cep.substring(5, 8));
				return builder.toString();
			}
		}
		
		return cep;
	}
	
	/**
	 * Formata um CPF ou CNPJ com pontos e traço .
	 * Exemplo: 09876523412 ==> 098.765.234-12
	 * @param cpf
	 * @return
	 */
	public static String cpf(String cpf){
		if (cpf != null ? !cpf.isEmpty():false){
			if (cpf.length() == 11){
				
				StringBuilder builder=new StringBuilder(cpf.substring(0, 3));
				builder.append(".");
				builder.append(cpf.substring(3, 6));
				builder.append(".");
				builder.append(cpf.substring(6, 9));
				builder.append("-");
				builder.append(cpf.substring(9, 11));
				return builder.toString();
			}
		}
		return cpf;
	}
	
	public static String telefone(String telefone){
		if (telefone == null? false: !telefone.isEmpty()){
			if (telefone.length() == 10){
				StringBuilder builder=new StringBuilder("(");
				builder.append(telefone.substring(0, 2));
				builder.append(") ");
				builder.append(telefone.substring(2, 6));
				builder.append("-");
				builder.append(telefone.substring(6, 10));
				return builder.toString();
			}
		}
		
		return telefone;
	}
}
