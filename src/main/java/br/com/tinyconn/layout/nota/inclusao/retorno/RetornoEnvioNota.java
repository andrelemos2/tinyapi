package br.com.tinyconn.layout.nota.inclusao.retorno;

import java.util.List;

import br.com.tinyconn.bean.Resposta;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("retorno")
public class RetornoEnvioNota implements Resposta{

	/**
	 * Conforme tabela "Status de Processamento"
	 */
	@XStreamAlias("status_processamento")
	private Integer statusProcessamento;

	/**
	 * Contém o status do retorno "OK" ou "Erro". Para o caso de conter erros
	 * estes serão descritos abaixo
	 */
	private String status;

	/**
	 * Conforme tabela "Códigos de erro"
	 */
	@XStreamAlias("codigo_erro")
	private Integer codigoErro;

	/**
	 * Condicional [0..n] - Contém a lista dos erros encontrados.
	 */
	private List<Erro> erros;

	/**
	 * Lista de resultados da inclusão
	 */
	private List<Registro> registros;

	public RetornoEnvioNota() {
		super();
	}

	public RetornoEnvioNota(Integer statusProcessamento, String status,
			Integer codigoErro, List<Erro> erros, List<Registro> registros) {
		super();
		this.statusProcessamento = statusProcessamento;
		this.status = status;
		this.codigoErro = codigoErro;
		this.erros = erros;
		this.registros = registros;
	}

	public Integer getStatusProcessamento() {
		return statusProcessamento;
	}

	public void setStatusProcessamento(Integer statusProcessamento) {
		this.statusProcessamento = statusProcessamento;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getCodigoErro() {
		return codigoErro;
	}

	public void setCodigoErro(Integer codigoErro) {
		this.codigoErro = codigoErro;
	}

	public List<Erro> getErros() {
		return erros;
	}

	public void setErros(List<Erro> erros) {
		this.erros = erros;
	}

	public List<Registro> getRegistros() {
		return registros;
	}

	public void setRegistros(List<Registro> registros) {
		this.registros = registros;
	}

}
