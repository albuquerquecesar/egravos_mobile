package br.com.eagravos.mobile.tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Formata datas
 * @author albuquerque
 *
 */
public class DateFormat {

	/**
	 * Formato americano da data
	 */
	private static final SimpleDateFormat americanDate = new SimpleDateFormat("yyyy-MM-dd");
	/**
	 * Formato americano da data com hora (timestamp)
	 */
	private static final SimpleDateFormat americanDateTime = new SimpleDateFormat("yyyy-MM-dd H:mm:ss");
	/**
	 * Formato brasileiro de data
	 */
	private static final SimpleDateFormat brazilianDate = new SimpleDateFormat("dd/MM/yyyy");
	/**
	 * Formato brasileiro da data com hora (timestamp)
	 */
	private static final SimpleDateFormat brazilianDateTime = new SimpleDateFormat("dd/MM/yyyy H:mm:ss");

	/**
	 * Retorna uma data a partir do seguinte formato 
	 * yyyy-MM-dd ou yyyy-MM-dd H:mm:ss
	 * @param date
	 * @return
	 */
	public static Date extractDateAmericanFormat(String date) {
		try {
			int size = date.length();
			if (size > 10) {
				return americanDateTime.parse(date);
			} else {
				return americanDate.parse(date);
			}
		} catch (ParseException ex) {
			return null;
		}
	}
	
	/**
	 * Retorna um data a parti do seguinte formato: dd/MM/yyyy ou dd/MM/yyyy H:mm:ss
	 * @param date
	 * @return
	 */
	public static Date extractDateBrazilianFormat(String date) {
		try {
			int size = date.length();
			if (size > 10) {
				return brazilianDateTime.parse(date);
			} else {
				return brazilianDate.parse(date);
			}
		} catch (ParseException ex) {
			return null;
		}
	}
	
	/**
	 * Retorna uma string com a data no formato americano.
	 * Exemplo: 2013-12-31
	 * @param data
	 * @return
	 */
	public static String getAmericanFormatDate(Date data){
		try{
			return americanDate.format(data);
		}catch(Exception ex){
			return null;
		}
	}
	
	/**
	 * Retorna uma string com a data e hora no formato americano.
	 * Exemplo: 2013-12-31 22:32:34
	 * @param data
	 * @return
	 */
	public static String getAmericanFormatDatetime(Date data){
		try{
			return americanDateTime.format(data);
		}catch(Exception ex){
			return null;
		}
	}
	/**
	 * Retorna uma string com a data no formato brasileiro.
	 * Exemplo: 31/12/2013
	 * @param data
	 * @return
	 */
	public static String getBrazilianFormatDate(Date data){
		try{
			return brazilianDate.format(data);
		}catch(Exception ex){
			return null;
		}
	}
	
	/**
	 * Retorna uma string com a data e hora no formato brasileiro.
	 * Exemplo: 31/12/2013 23:34:12
	 * @param data
	 * @return
	 */
	public static String getBrazilianFormatDatetime(Date data){
		try{
			return brazilianDateTime.format(data);
		}catch(Exception ex){
			return null;
		}
	}
}
