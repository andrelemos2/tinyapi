package br.com.tinyconn.layout.enumeration;

/**
 * Define o tipo do frete "R"-Remetente, "D"-Destinat�rio
 * 
 * @author Andre
 *
 */
public enum TipoFreteEnum {

	REMETENTE("R"), DESTINATARIO("D");

	private String label;

	private TipoFreteEnum(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return label;
	}
}
