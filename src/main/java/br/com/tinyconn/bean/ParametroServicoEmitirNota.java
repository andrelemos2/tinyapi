package br.com.tinyconn.bean;

import br.com.cdsl.annotations.field.NotNull;
import br.com.tinyconn.exception.CampoVazioException;
import br.com.tinyconn.layout.enumeration.OpcaoSimNaoEnum;

/**
 * Parametro para emiss�o de nota
 * @author Andre
 *
 */
public class ParametroServicoEmitirNota implements ParametroServico {

	/**
	 * Chave gerada para identificar sua empresa
	 */
	@NotNull(exception = CampoVazioException.class, emptyIsNull = true)
	private String token;

	/**
	 * N�mero de identifica��o da nota fiscal no Tiny (n)
	 */
	@NotNull(exception = CampoVazioException.class, emptyIsNull = true)
	private Integer id;

	/**
	 * S�rie da Nota Fiscal (n)
	 */
	private String serie;
	/**
	 * N�mero da Nota Fiscal (n)
	 */
	private String numero;

	/**
	 * (S/N) op��o para enviar a nota para o email do cliente
	 */
	private OpcaoSimNaoEnum enviarEmail;

	/**
	 * Chave gerada para identificar sua empresa
	 */
	@NotNull(exception = CampoVazioException.class, emptyIsNull = true)
	private String formato;

	public ParametroServicoEmitirNota() {
		super();
	}

	public ParametroServicoEmitirNota(String token, Integer id, String serie,
			String numero, OpcaoSimNaoEnum enviarEmail, String formato) {
		super();
		this.token = token;
		this.id = id;
		this.serie = serie;
		this.numero = numero;
		this.enviarEmail = enviarEmail;
		this.formato = formato;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public OpcaoSimNaoEnum getEnviarEmail() {
		return enviarEmail;
	}

	public void setEnviarEmail(OpcaoSimNaoEnum enviarEmail) {
		this.enviarEmail = enviarEmail;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

}
