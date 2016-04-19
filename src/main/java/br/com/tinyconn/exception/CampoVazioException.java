package br.com.tinyconn.exception;

/**
 * Exception utilizada para campos com valores obrigat�rios e que est�o nulos ou
 * vazios<br>
 * Vazio validado somente quando configurado no campo
 * 
 * @author Andre
 *
 */
public class CampoVazioException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1113734432297892510L;

	public CampoVazioException() {
		super();
	}

	public CampoVazioException(String message) {
		super(message);
	}
}
