package br.com.tinyconn.layout.enumeration;

/**
 * Define o tipo da pessoa
 * 
 * @author Andre
 *
 */
public enum TipoPessoaEnum {

	FISICA("F"), JURIDICA("J"), ESTRANGEIRA("E");

	private String label;

	private TipoPessoaEnum(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return label;
	}
}
