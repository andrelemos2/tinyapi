package br.com.tinyconn.layout.nota.inclusao.envio;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import br.com.cdsl.annotations.field.NotNull;
import br.com.cdsl.annotations.field.Range;
import br.com.cdsl.annotations.field.Size;
import br.com.tinyconn.exception.CampoVazioException;
import br.com.tinyconn.exception.TamanhoInvalidoException;
import br.com.tinyconn.exception.ValorInvalidoException;
import br.com.tinyconn.layout.enumeration.TipoItemEnum;
import br.com.tinyconn.layout.nota.BeanLayoutNota;

/**
 * Elemento utilizado para representar uma nota
 * 
 * @author Andre
 *
 */
@XStreamAlias("item")
public class Item implements BeanLayoutNota {

	/**
	 * C�digo do Produto <br>
	 * Estes campos s�o utilizados para pesquisar se o produto est� cadastrado,
	 * caso esteja os demais campos s�o carregados do cadastro.
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 60)
	private String codigo;

	/**
	 * Descri��o do Produto <br>
	 * Estes campos s�o utilizados para pesquisar se o produto est� cadastrado,
	 * caso esteja os demais campos s�o carregados do cadastro.
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 120)
	@NotNull(exception = CampoVazioException.class, emptyIsNull = true)
	private String descricao;

	/**
	 * Unidade do produto
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 2)
	@NotNull(exception = CampoVazioException.class, emptyIsNull = true)
	private String unidade;

	/**
	 * Quantidade do produto <br>
	 * Estes campos utilizam "." (ponto) como separador de decimais, exemplo
	 * "5.25".
	 */
	@NotNull(exception = CampoVazioException.class, emptyIsNull = true)
	@Range(exception = ValorInvalidoException.class, min = "0")
	private Double quantidade;

	/**
	 * Valor unit�rio do produto <br>
	 * Estes campos utilizam "." (ponto) como separador de decimais, exemplo
	 * "5.25".
	 */
	@NotNull(exception = CampoVazioException.class, emptyIsNull = true)
	@Range(exception = ValorInvalidoException.class, min = "0")
	private Double valor_unitario;

	/**
	 * Indica se � produto("P") ou servi�o("S")
	 */
	@NotNull(exception = CampoVazioException.class)
	private TipoItemEnum tipo;

	/**
	 * C�digo conforme Tabela Origem
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 1)
	private String origem;

	/**
	 * N�mero de controle da FCI - Ficha de Conte�do de Importa��o
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 36)
	private String numero_fci;

	/**
	 * NCM do produto
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 10)
	private String ncm;

	/**
	 * Peso Bruto do produto <br>
	 * Estes campos utilizam "." (ponto) como separador de decimais, exemplo
	 * "5.25".
	 */
	@Range(exception = ValorInvalidoException.class, min = "0")
	private String peso_bruto;

	/**
	 * Peso L�quido do produto <br>
	 * Estes campos utilizam "." (ponto) como separador de decimais, exemplo
	 * "5.25".
	 */
	@Range(exception = ValorInvalidoException.class, min = "0")
	private String peso_liquido;

	/**
	 * GTIN/EAN do produto
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 14)
	private String gtin_ean;

	/**
	 * GTIN/EAN da embalagem do produto
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 14)
	private String gtin_ean_embalagem;

	/**
	 * C�digo da lista de servi�os <br>
	 * Estes campo � utilizado somente quando o item se trata de um servi�o
	 * (campo tipo do item for "S").
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 5)
	private String codigo_lista_servicos;

	/**
	 * Valor da aliquota de comiss�o do item
	 */
	@Range(exception = ValorInvalidoException.class, min = "0")
	private String aliquota_comissao;

	/**
	 * C�digo cest do item
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 10)
	private String cest;

	public Item() {
		super();
	}

	public Item(String codigo, String descricao, String unidade,
			Double quantidade, Double valor_unitario, TipoItemEnum tipo,
			String origem, String numero_fci, String ncm, String peso_bruto,
			String peso_liquido, String gtin_ean, String gtin_ean_embalagem,
			String codigo_lista_servicos, String aliquota_comissao, String cest) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.unidade = unidade;
		this.quantidade = quantidade;
		this.valor_unitario = valor_unitario;
		this.tipo = tipo;
		this.origem = origem;
		this.numero_fci = numero_fci;
		this.ncm = ncm;
		this.peso_bruto = peso_bruto;
		this.peso_liquido = peso_liquido;
		this.gtin_ean = gtin_ean;
		this.gtin_ean_embalagem = gtin_ean_embalagem;
		this.codigo_lista_servicos = codigo_lista_servicos;
		this.aliquota_comissao = aliquota_comissao;
		this.cest = cest;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValor_unitario() {
		return valor_unitario;
	}

	public void setValor_unitario(Double valor_unitario) {
		this.valor_unitario = valor_unitario;
	}

	public TipoItemEnum getTipo() {
		return tipo;
	}

	public void setTipo(TipoItemEnum tipo) {
		this.tipo = tipo;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getNumero_fci() {
		return numero_fci;
	}

	public void setNumero_fci(String numero_fci) {
		this.numero_fci = numero_fci;
	}

	public String getNcm() {
		return ncm;
	}

	public void setNcm(String ncm) {
		this.ncm = ncm;
	}

	public String getPeso_bruto() {
		return peso_bruto;
	}

	public void setPeso_bruto(String peso_bruto) {
		this.peso_bruto = peso_bruto;
	}

	public String getPeso_liquido() {
		return peso_liquido;
	}

	public void setPeso_liquido(String peso_liquido) {
		this.peso_liquido = peso_liquido;
	}

	public String getGtin_ean() {
		return gtin_ean;
	}

	public void setGtin_ean(String gtin_ean) {
		this.gtin_ean = gtin_ean;
	}

	public String getGtin_ean_embalagem() {
		return gtin_ean_embalagem;
	}

	public void setGtin_ean_embalagem(String gtin_ean_embalagem) {
		this.gtin_ean_embalagem = gtin_ean_embalagem;
	}

	public String getCodigo_lista_servicos() {
		return codigo_lista_servicos;
	}

	public void setCodigo_lista_servicos(String codigo_lista_servicos) {
		this.codigo_lista_servicos = codigo_lista_servicos;
	}

	public String getAliquota_comissao() {
		return aliquota_comissao;
	}

	public void setAliquota_comissao(String aliquota_comissao) {
		this.aliquota_comissao = aliquota_comissao;
	}

	public String getCest() {
		return cest;
	}

	public void setCest(String cest) {
		this.cest = cest;
	}

}
