package br.com.eagravos.mobile.tools;

import java.lang.reflect.Type;
import java.util.Date;

import com.google.smsjson.JsonElement;
import com.google.smsjson.JsonNull;
import com.google.smsjson.JsonPrimitive;
import com.google.smsjson.JsonSerializationContext;
import com.google.smsjson.JsonSerializer;

/**
 * Classe utilizada para formatar a data
 * quando usar a biblioteca gson
 * @author albuquerque
 *
 */
public class DataSerializer implements JsonSerializer<Date>{

	@Override
	public JsonElement serialize(Date arg0, Type arg1,
			JsonSerializationContext arg2) {
		if (arg0!= null){
			
			return new JsonPrimitive(DateFormat.getAmericanFormatDatetime(arg0));
		}
		return new JsonNull();
	}
}
