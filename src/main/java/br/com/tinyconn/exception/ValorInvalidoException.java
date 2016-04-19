package br.com.tinyconn.exception;

/**
 * Exception utilizada para valores inv�lidos quando informado.
 * 
 * @author Andre
 *
 */
public class ValorInvalidoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7834349059977980003L;

	public ValorInvalidoException() {
		super();
	}

	public ValorInvalidoException(String message) {
		super(message);
	}
}
