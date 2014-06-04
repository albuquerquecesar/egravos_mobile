package br.com.eagravos.mobile.item;

import java.util.List;

public class SincronizacaoItem {

	private String nome;
	private boolean checked;
	private List<Sincronizacao> sincronizacoes;

	public SincronizacaoItem(String nome,
			List<Sincronizacao> sincronizacao) {
		super();
		this.nome = nome;
		this.sincronizacoes = sincronizacao;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @return the sincronizacoes
	 */
	public List<Sincronizacao> getSincronizacoes() {
		return sincronizacoes;
	}

	/**
	 * @return the checked
	 */
	public boolean isChecked() {
		return checked;
	}

	/**
	 * @param checked the checked to set
	 */
	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	
}
