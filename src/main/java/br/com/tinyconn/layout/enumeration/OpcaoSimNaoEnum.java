package br.com.tinyconn.layout.enumeration;

/**
 * Op��es comum com possibilidade apenas de SIM = S e NAO = N
 * 
 * @author Andre
 *
 */
public enum OpcaoSimNaoEnum {

	SIM("S"), NAO("N");

	private String label;

	private OpcaoSimNaoEnum(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return label;
	}

}
