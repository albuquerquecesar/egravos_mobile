package br.com.eagravos.mobile.tools;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Classe utilizada para criptografia
 * de dados
 * @author albuquerque
 *
 */
public class Criptografia {

	private static final char[] hexaDigitos = "0123456789abcdef".toCharArray();
	public static String MD5 = "MD5";
	public static String SHA1 = "SHA-1";

	/**
	 * Criptografa uma string utilizando o algoritmo passado.
	 * @param value a string a ser criptografada
	 * @param algorithm o algoritmo a ser utilizado
	 * @return caso nenhum erro ocorra, devolve o valor criptografado
	 */
	public static String criptografe(String value, String algorithm) {
		String resposta = null;
		try {
			MessageDigest digest = MessageDigest.getInstance(algorithm);
			digest.update(value.getBytes());
			StringBuilder sb = new StringBuilder();
			for (byte b : digest.digest()) {
				sb.append(hexaDigitos[(b >> 4) & 0x0f]);
				sb.append(hexaDigitos[b & 0x0f]);
			}
			resposta = sb.toString();
		} catch (NoSuchAlgorithmException ex) {
			ex.printStackTrace();
		} finally {
			return resposta;
		}
	}
}
