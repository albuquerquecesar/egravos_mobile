package br.com.eagravos.mobile.tools;

/**
 * Classe utilizada para montar um filtro
 * em buscas de webservices.
 * @author albuquerque
 *
 */
public class Filter {
	
	private String porperty;
	private Object value;
	private Operator operator;
	
	
	/**
	 * 
	 * @param porperty nome da propriedade a ser filtrada,
	 * geralmente do campo do modelo. Deve-se olhar
	 * os atributos do JSON do modelo em questão. Pois,
	 * os nomes dos modelos (e seus atributos) da aplicação podem diferir dos modelos
	 * utilizados no webservice
	 * @param value o valor a ser pesquisado
	 * @param operator operador de comparação utilizado (operadores SQL)
	 */
	public Filter(String porperty, Object value, Operator operator) {
		super();
		this.porperty = porperty;
		this.value = value;
		this.operator = operator;
	}
	
	
	/**
	 * Devolve o filtro em formato JSON para ser enviado
	 * ao webservice
	 * @return
	 */
	public String toJson(){
		StringBuilder builder=new StringBuilder();
		
		builder.append("{");
		
		builder.append("\"property\":\"");
		builder.append(this.porperty);
		builder.append("\",");
		
		builder.append("\"value\":\"");
		builder.append(this.value);
		builder.append("\",");
		
		builder.append("\"operator\":\"");
		builder.append(this.operator.getValor());
		builder.append("\"");
		
		builder.append("}");
		
		return builder.toString();
	}
}
