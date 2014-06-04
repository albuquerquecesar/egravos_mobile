package br.com.eagravos.mobile.tools;

import java.util.Random;

/**
 * Fornece métodos para manipular números
 * @author albuquerque
 *
 */
public class NumberUtils {

	private static final char[] hexasDigits="0123456789ABCDEF".toCharArray();
	
	/**
	 * Gera um número hexadecimal aleatoriamente
	 * @param length quantidade de dígitos
	 * @return uma string que representa um número em hexadecimal
	 */
	public static String randomHexadecimalNumber(int length){
		StringBuilder builder=new StringBuilder();
		Random random=new Random();
		for (int i = 0; i < length; i++) {
			char c=hexasDigits[random.nextInt(hexasDigits.length)];
			builder.append(c);
		}
		
		return builder.toString();
	}
}
