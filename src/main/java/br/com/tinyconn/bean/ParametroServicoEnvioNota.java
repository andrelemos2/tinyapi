package br.com.tinyconn.bean;

import br.com.cdsl.annotations.field.NotNull;

/**
 * Cabe�alho de envio, cont�m a nota fiscal a ser enviada
 * 
 * @author Andre
 *
 */
public class ParametroServicoEnvioNota implements ParametroServico {

	/**
	 * Chave gerada para identificar sua empresa
	 */
	@NotNull(exception = Exception.class, emptyIsNull = true)
	private String token;

	/**
	 * Dados da nota conforme layout
	 */
	@NotNull(exception = Exception.class, emptyIsNull = true)
	private String nota;

	/**
	 * Formato do retorno (json ou xml)
	 */
	@NotNull(emptyIsNull = true)
	private String formato;

	public ParametroServicoEnvioNota() {
		super();
	}

	public ParametroServicoEnvioNota(String token, String nota, String formato) {
		super();
		this.token = token;
		this.nota = nota;
		this.formato = formato;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

}
