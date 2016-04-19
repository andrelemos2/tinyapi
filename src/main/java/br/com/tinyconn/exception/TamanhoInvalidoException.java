package br.com.tinyconn.exception;

/**
 * Exception utilizada quando o campo for informado com valor maior que o limite
 * configurado no campo
 * 
 * @author Andre
 *
 */
public class TamanhoInvalidoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6836390861652449502L;

	public TamanhoInvalidoException() {
		super();
	}

	public TamanhoInvalidoException(String message) {
		super(message);
	}

}
