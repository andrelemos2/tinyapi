package br.com.tinyconn.layout.nota.emissao.retorno;

import java.util.List;

import br.com.tinyconn.bean.Resposta;
import br.com.tinyconn.layout.nota.inclusao.retorno.Erro;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("retorno")
public class RetornoEmissaoNota implements Resposta{

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
	 * Contém a lista dos erros encontrados.
	 */
	private List<Erro> erros;

	@XStreamAlias("nota_fiscal")
	private NotaFiscalEmissao notaFiscal;

	public RetornoEmissaoNota() {
		super();
	}

	public RetornoEmissaoNota(Integer statusProcessamento, String status,
			Integer codigoErro, List<Erro> erros, NotaFiscalEmissao notaFiscal) {
		super();
		this.statusProcessamento = statusProcessamento;
		this.status = status;
		this.codigoErro = codigoErro;
		this.erros = erros;
		this.notaFiscal = notaFiscal;
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

	public NotaFiscalEmissao getNotaFiscal() {
		return notaFiscal;
	}

	public void setNotaFiscal(NotaFiscalEmissao notaFiscal) {
		this.notaFiscal = notaFiscal;
	}

}
