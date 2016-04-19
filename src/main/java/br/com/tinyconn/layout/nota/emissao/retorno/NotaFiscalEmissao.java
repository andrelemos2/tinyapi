package br.com.tinyconn.layout.nota.emissao.retorno;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("nota_fiscal")
public class NotaFiscalEmissao {

	/**
	 * Número de identificação da nota fiscal no Tiny
	 */
	private Integer id;

	/**
	 * Chave de acesso da nota fiscal
	 */
	@XStreamAlias("chave_acesso")
	private String chaveAcesso;

	/**
	 * Link para acessar a nota fiscal
	 */
	@XStreamAlias("link_acesso")
	private String linkAcesso;

	/**
	 * Código conforme tabela de "Situações das Notas Fiscais"
	 */
	private Integer situacao;

	/**
	 * Descrição conforme tabela de "Situações das Notas Fiscais"
	 */
	@XStreamAlias("descricao_situacao")
	private String descricaoSituacao;

	public NotaFiscalEmissao() {
		super();
	}

	public NotaFiscalEmissao(Integer id, String chaveAcesso, String linkAcesso,
			Integer situacao, String descricaoSituacao) {
		super();
		this.id = id;
		this.chaveAcesso = chaveAcesso;
		this.linkAcesso = linkAcesso;
		this.situacao = situacao;
		this.descricaoSituacao = descricaoSituacao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getChaveAcesso() {
		return chaveAcesso;
	}

	public void setChaveAcesso(String chaveAcesso) {
		this.chaveAcesso = chaveAcesso;
	}

	public String getLinkAcesso() {
		return linkAcesso;
	}

	public void setLinkAcesso(String linkAcesso) {
		this.linkAcesso = linkAcesso;
	}

	public Integer getSituacao() {
		return situacao;
	}

	public void setSituacao(Integer situacao) {
		this.situacao = situacao;
	}

	public String getDescricaoSituacao() {
		return descricaoSituacao;
	}

	public void setDescricaoSituacao(String descricaoSituacao) {
		this.descricaoSituacao = descricaoSituacao;
	}

}
