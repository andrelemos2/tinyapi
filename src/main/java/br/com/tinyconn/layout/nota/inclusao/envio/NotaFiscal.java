package br.com.tinyconn.layout.nota.inclusao.envio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import br.com.cdsl.annotations.field.NotEmpty;
import br.com.cdsl.annotations.field.NotNull;
import br.com.cdsl.annotations.field.Range;
import br.com.cdsl.annotations.field.Size;
import br.com.tinyconn.exception.CampoVazioException;
import br.com.tinyconn.exception.TamanhoInvalidoException;
import br.com.tinyconn.exception.ValorInvalidoException;
import br.com.tinyconn.layout.enumeration.NotaFiscalTipoEnum;
import br.com.tinyconn.layout.enumeration.TipoFreteEnum;
import br.com.tinyconn.layout.nota.BeanLayoutNota;

/**
 * Elemento utilizado para representar uma nota fiscal.
 * 
 * @author Andre
 *
 */
@XStreamAlias("nota_fiscal")
public class NotaFiscal implements BeanLayoutNota {

	/**
	 * Tipo de nota fiscal (E - Entrada, S - Sa�da), caso n�o seja informado o
	 * valor padr�o � "S"
	 */
	@NotNull(exception = CampoVazioException.class, messageException = "Tipo da nota fiscal obrigat�rio.")
	private NotaFiscalTipoEnum tipo;

	/**
	 * Natureza de opera��o da nota fiscal previamente cadastrada no Tiny <br>
	 * Caso n�o seja informado valor, o sistema assumir� automaticamente a
	 * natureza de opera��o padr�o, de acordo com o tipo de nota(E/S).
	 */
	@XStreamAlias("natureza_operacao")
	@Size(exception = TamanhoInvalidoException.class, max = 50)
	private String naturezaOperacao;

	/**
	 * Data de emiss�o da nota fiscal <br>
	 * Estes campos dever ser informado no formato dd/mm/yyyy, exemplo
	 * "01/01/2012".
	 */
	@XStreamAlias("data_emissao")
	private Date dataEmissao;

	/**
	 * Data entrada/sa�da da nota fiscal <br>
	 * Estes campos dever ser informado no formato dd/mm/yyyy, exemplo
	 * "01/01/2012".
	 */
	@XStreamAlias("data_entrada_saida")
	private Date dataEntradaSaida;

	/**
	 * Hora entrada/sa�da da nota fiscal <br>
	 * Estes campos utilizam o formato hh:mm:ss, exemplo "10:45:01".
	 */
	private String horaEntradaSaida;

	/**
	 * Elemento utilizado para representar o cliente
	 */
	@NotNull(exception = CampoVazioException.class, messageException = "Cliente obrigat�rio.")
	private Cliente cliente;

	/**
	 * Elemento utilizado para representar o endere�o de entrega, caso seja
	 * diferente do endere�o do cliente
	 */
	@XStreamAlias("endereco_entrega")
	private EnderecoEntrega enderecoEntrega;

	/**
	 * Elemento utilizado para representar uma nota
	 */
	@NotEmpty(exception = CampoVazioException.class, messageException = "Lista de itens obrigat�ria.")
	private List<Item> itens;

	/**
	 * Lista de parcelas da nota
	 */
	private List<Parcela> parcelas;

	/**
	 * Elemento utilizado para representar o transportador
	 */
	private Transportador transportador;

	/**
	 * Forma de frete de acordo com o cadastro no Tiny
	 */
	@XStreamAlias("forma_frete")
	@Size(exception = TamanhoInvalidoException.class, max = 30)
	private String formaFrete;

	/**
	 * "R"-Remetente, "D"-Destinat�rio
	 */
	@XStreamAlias("frete_por_conta")
	@NotNull(exception = CampoVazioException.class, messageException = "Identifica��o do frete obrigat�rio.", emptyIsNull = true)
	@Size(exception = TamanhoInvalidoException.class, max = 50)
	private TipoFreteEnum fretePorConta;

	/**
	 * Placa do ve�culo transportador
	 */
	@XStreamAlias("placa_veiculo")
	@Size(exception = TamanhoInvalidoException.class, max = 1)
	private String placaVeiculo;// string 1 opcional

	/**
	 * UF da placa do ve�culo transportador
	 */
	@XStreamAlias("uf_veiculo")
	@Size(exception = TamanhoInvalidoException.class, max = 1)
	private String ufVeiculo;

	/**
	 * Quantidade de volumes da nota fiscal
	 */
	@XStreamAlias("quantidade_volumes")
	@Range(exception = ValorInvalidoException.class, min = "0")
	private String quantidadeVolumes;

	/**
	 * Esp�cie dos volumes da nota fiscal
	 */
	@XStreamAlias("especie_volumes")
	@Size(exception = TamanhoInvalidoException.class, max = 20)
	private String especieVolumes;

	/**
	 * Marca dos volumes da nota fiscal
	 */
	@XStreamAlias("marca_volumes")
	@Size(exception = TamanhoInvalidoException.class, max = 20)
	private String marcaVolumes;

	/**
	 * N�mero dos volumes da nota fiscal
	 */
	@XStreamAlias("numero_volumes")
	@Size(exception = TamanhoInvalidoException.class, max = 20)
	private String numeroVolumes;

	/**
	 * Valor do desconto da nota fiscal <br>
	 * Estes campos utilizam "." (ponto) como separador de decimais, exemplo
	 * "5.25".
	 */
	@XStreamAlias("valor_desconto")
	@Range(exception = ValorInvalidoException.class, min = "0")
	private String valorDesconto;

	/**
	 * Valor do frete da nota fiscal <br>
	 * Estes campos utilizam "." (ponto) como separador de decimais, exemplo
	 * "5.25".
	 */
	@XStreamAlias("valor_frete")
	@Range(exception = ValorInvalidoException.class, min = "0")
	private String valorFrete;

	/**
	 * Valor do seguro da nota fiscal <br>
	 * Estes campos utilizam "." (ponto) como separador de decimais, exemplo
	 * "5.25".
	 */
	@XStreamAlias("valor_seguro")
	@Range(exception = ValorInvalidoException.class, min = "0")
	private String valorSeguro;

	/**
	 * Valor das outras despesas da nota fiscal <br>
	 * Estes campos utilizam "." (ponto) como separador de decimais, exemplo
	 * "5.25".
	 */
	@XStreamAlias("valor_despesas")
	@Range(exception = ValorInvalidoException.class, min = "0")
	private String valorDespesas;

	/**
	 * Elemento utilizado para representar a nota fiscal de referencia do
	 * produtor rural
	 */
	@XStreamAlias("nf_produtor_rural")
	private NfProdutorRural nfProdutorRural;

	/**
	 * N�mero de identifica��o do Vendedor cadastrado no Tiny. <br>
	 * Caso o vendedor n�o seja localizado ser� apresentado um erro de
	 * valida��o.
	 */
	@XStreamAlias("id_vendedor")
	@Range(exception = ValorInvalidoException.class, min = "0")
	private Integer idVendedor;

	/**
	 * Nome do Vendedor cadastrado no Tiny. <br>
	 * Caso o vendedor n�o seja localizado ser� apresentado um erro de
	 * valida��o. <br>
	 * Este campo ser� desconsiderado caso haja valor no campo id_vendedor.
	 */
	@XStreamAlias("nome_vendedor")
	@Size(exception = TamanhoInvalidoException.class, max = 50)
	private String nomeVendedor;

	/**
	 * N�mero de identifica��o do pedido no e-commerce (ou no seu sistema)
	 */
	@XStreamAlias("numero_pedido_ecommerce")
	@Size(exception = TamanhoInvalidoException.class, max = 10)
	private String numeroPedidoEcommerce;

	/**
	 * Observa��o da nota fiscal
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 100)
	private String obs;

	/**
	 * Plataforma que est� enviando a nota fiscal
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 50)
	private String ecommerce;

	public NotaFiscal() {
		super();
	}

	public NotaFiscal(NotaFiscalTipoEnum tipo, String naturezaOperacao,
			Date dataEmissao, Date dataEntradaSaida, String horaEntradaSaida,
			Cliente cliente, EnderecoEntrega enderecoEntrega, List<Item> itens,
			List<Parcela> parcelas, Transportador transportador,
			String formaFrete, TipoFreteEnum fretePorConta,
			String placaVeiculo, String ufVeiculo, String quantidadeVolumes,
			String especieVolumes, String marcaVolumes, String numeroVolumes,
			String valorDesconto, String valorFrete, String valorSeguro,
			String valorDespesas, NfProdutorRural nfProdutorRural,
			Integer idVendedor, String nomeVendedor,
			String numeroPedidoEcommerce, String obs, String ecommerce) {
		super();
		this.tipo = tipo;
		this.naturezaOperacao = naturezaOperacao;
		this.dataEmissao = dataEmissao;
		this.dataEntradaSaida = dataEntradaSaida;
		this.horaEntradaSaida = horaEntradaSaida;
		this.cliente = cliente;
		this.enderecoEntrega = enderecoEntrega;
		this.itens = itens;
		this.parcelas = parcelas;
		this.transportador = transportador;
		this.formaFrete = formaFrete;
		this.fretePorConta = fretePorConta;
		this.placaVeiculo = placaVeiculo;
		this.ufVeiculo = ufVeiculo;
		this.quantidadeVolumes = quantidadeVolumes;
		this.especieVolumes = especieVolumes;
		this.marcaVolumes = marcaVolumes;
		this.numeroVolumes = numeroVolumes;
		this.valorDesconto = valorDesconto;
		this.valorFrete = valorFrete;
		this.valorSeguro = valorSeguro;
		this.valorDespesas = valorDespesas;
		this.nfProdutorRural = nfProdutorRural;
		this.idVendedor = idVendedor;
		this.nomeVendedor = nomeVendedor;
		this.numeroPedidoEcommerce = numeroPedidoEcommerce;
		this.obs = obs;
		this.ecommerce = ecommerce;
	}

	public String getHoraEntradaSaida() {
		return horaEntradaSaida;
	}

	public void setHoraEntradaSaida(String horaEntradaSaida) {
		this.horaEntradaSaida = horaEntradaSaida;
	}

	public NotaFiscalTipoEnum getTipo() {
		return tipo;
	}

	public void setTipo(NotaFiscalTipoEnum tipo) {
		this.tipo = tipo;
	}

	public String getNaturezaOperacao() {
		return naturezaOperacao;
	}

	public void setNaturezaOperacao(String naturezaOperacao) {
		this.naturezaOperacao = naturezaOperacao;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public Date getDataEntradaSaida() {
		return dataEntradaSaida;
	}

	public void setDataEntradaSaida(Date dataEntradaSaida) {
		this.dataEntradaSaida = dataEntradaSaida;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public EnderecoEntrega getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(EnderecoEntrega enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	public List<Parcela> getParcelas() {
		return parcelas;
	}

	public void setParcelas(List<Parcela> parcelas) {
		this.parcelas = parcelas;
	}

	public Transportador getTransportador() {
		return transportador;
	}

	public void setTransportador(Transportador transportador) {
		this.transportador = transportador;
	}

	public String getFormaFrete() {
		return formaFrete;
	}

	public void setFormaFrete(String formaFrete) {
		this.formaFrete = formaFrete;
	}

	public TipoFreteEnum getFretePorConta() {
		return fretePorConta;
	}

	public void setFretePorConta(TipoFreteEnum fretePorConta) {
		this.fretePorConta = fretePorConta;
	}

	public String getPlacaVeiculo() {
		return placaVeiculo;
	}

	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}

	public String getUfVeiculo() {
		return ufVeiculo;
	}

	public void setUfVeiculo(String ufVeiculo) {
		this.ufVeiculo = ufVeiculo;
	}

	public String getQuantidadeVolumes() {
		return quantidadeVolumes;
	}

	public void setQuantidadeVolumes(String quantidadeVolumes) {
		this.quantidadeVolumes = quantidadeVolumes;
	}

	public String getEspecieVolumes() {
		return especieVolumes;
	}

	public void setEspecieVolumes(String especieVolumes) {
		this.especieVolumes = especieVolumes;
	}

	public String getMarcaVolumes() {
		return marcaVolumes;
	}

	public void setMarcaVolumes(String marcaVolumes) {
		this.marcaVolumes = marcaVolumes;
	}

	public String getNumeroVolumes() {
		return numeroVolumes;
	}

	public void setNumeroVolumes(String numeroVolumes) {
		this.numeroVolumes = numeroVolumes;
	}

	public String getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(String valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public String getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(String valorFrete) {
		this.valorFrete = valorFrete;
	}

	public String getValorSeguro() {
		return valorSeguro;
	}

	public void setValorSeguro(String valorSeguro) {
		this.valorSeguro = valorSeguro;
	}

	public String getValorDespesas() {
		return valorDespesas;
	}

	public void setValorDespesas(String valorDespesas) {
		this.valorDespesas = valorDespesas;
	}

	public NfProdutorRural getNfProdutorRural() {
		return nfProdutorRural;
	}

	public void setNfProdutorRural(NfProdutorRural nfProdutorRural) {
		this.nfProdutorRural = nfProdutorRural;
	}

	public Integer getIdVendedor() {
		return idVendedor;
	}

	public void setIdVendedor(Integer idVendedor) {
		this.idVendedor = idVendedor;
	}

	public String getNomeVendedor() {
		return nomeVendedor;
	}

	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}

	public String getNumeroPedidoEcommerce() {
		return numeroPedidoEcommerce;
	}

	public void setNumeroPedidoEcommerce(String numeroPedidoEcommerce) {
		this.numeroPedidoEcommerce = numeroPedidoEcommerce;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String getEcommerce() {
		return ecommerce;
	}

	public void setEcommerce(String ecommerce) {
		this.ecommerce = ecommerce;
	}

	/**
	 * Adiciona um novo item<br>
	 * Cria uma nova lista caso necess�rio
	 * 
	 * @param item
	 *            {@link Item}
	 */
	public void addItem(Item item) {
		if (itens == null) {
			itens = new ArrayList<Item>();
		}
		itens.add(item);
	}

	/**
	 * Adiciona uma nova parcela<br>
	 * Cria uma nova lista caso necess�rio
	 * 
	 * @param parcela
	 *            {@link Parcela}
	 */
	public void addParcela(Parcela parcela) {
		if (parcelas == null) {
			parcelas = new ArrayList<Parcela>();
		}
		parcelas.add(parcela);
	}
}
