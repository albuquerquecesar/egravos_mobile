package br.com.eagravos.mobile.tools;

/**
 * Operadores disponíveis para consultas
 * em webservices
 * @author albuquerque
 *
 */
public enum Operator {
	
	EQUALS("="),GREATER(">"),LESS("<"),GREATER_EQUAL(">="),LESS_EQUAL("<="),UNEQUAL("!="),NOT_IN("not in");
	
	private final String valor;
	
	Operator(String valor){
		this.valor=valor;
	}

	public String getValor() {
		return valor;
	}
}
