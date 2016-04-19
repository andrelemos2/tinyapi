package br.com.tinyconn.layout.enumeration;

/**
 * Define o tipo do item
 * 
 * @author Andre
 *
 */
public enum TipoItemEnum {

	PRODUTO("P"), SERVICO("S");

	private String label;

	private TipoItemEnum(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return label;
	}

}
