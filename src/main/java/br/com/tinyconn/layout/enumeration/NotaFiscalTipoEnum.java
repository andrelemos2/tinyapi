package br.com.tinyconn.layout.enumeration;

/**
 * Define o tipo da nota fiscal
 * 
 * @author Andre
 *
 */
public enum NotaFiscalTipoEnum {

	ENTRADA("E"), SAIDA("S");

	private String label;

	private NotaFiscalTipoEnum(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return label;
	}

}
