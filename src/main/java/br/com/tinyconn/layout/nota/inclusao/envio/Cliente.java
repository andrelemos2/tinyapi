package br.com.tinyconn.layout.nota.inclusao.envio;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import br.com.cdsl.annotations.field.Size;
import br.com.tinyconn.exception.TamanhoInvalidoException;
import br.com.tinyconn.layout.enumeration.OpcaoSimNaoEnum;
import br.com.tinyconn.layout.enumeration.TipoPessoaEnum;
import br.com.tinyconn.layout.nota.BeanLayoutNota;

/**
 * Elemento utilizado para representar o cliente
 * 
 * @author Andre
 *
 */
@XStreamAlias("cliente")
public class Cliente implements BeanLayoutNota {

	/**
	 * C�digo do cliente <br>
	 * Estes campos s�o utilizados para pesquisar se o cliente est� cadastrado,
	 * caso esteja os demais campos s�o carregados do cadastro.
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 30)
	private String codigo;

	/**
	 * Nome do cliente <br>
	 * Estes campos s�o utilizados para pesquisar se o cliente est� cadastrado,
	 * caso esteja os demais campos s�o carregados do cadastro.
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 50)
	private String nome;

	/**
	 * Tipo de pessoa (F - F�sica, J - Jur�dica, E - Estrangeiro)
	 */
	@XStreamAlias("tipo_pessoa")
	private TipoPessoaEnum tipoPessoa;

	/**
	 * CPF ou CNPJ do cliente <br>
	 * Estes campos s�o utilizados para pesquisar se o cliente est� cadastrado,
	 * caso esteja os demais campos s�o carregados do cadastro.
	 */
	@XStreamAlias("cpf_cnpj")
	@Size(exception = TamanhoInvalidoException.class, max = 18)
	private String cpfCnpj;

	/**
	 * Inscri��o estadual do cliente
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 18)
	private String ie;

	/**
	 * RG do cliente
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 10)
	private String rg;

	/**
	 * Endere�o do cliente
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 50)
	private String endereco;

	/**
	 * N�mero do endere�o do cliente
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 10)
	private String numero;

	/**
	 * Complemento do endere�o do cliente
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 50)
	private String complemento;

	/**
	 * Bairro do cliente
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 30)
	private String bairro;

	/**
	 * Cep do cliente
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 10)
	private String cep;

	/**
	 * Nome da cidade do cliente conforme a Tabela de Cidades
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 30)
	private String cidade;

	/**
	 * UF do cliente
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 2)
	private String uf;

	/**
	 * Nome do Pa�s do cliente conforme Tabela de Pa�ses
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 50)
	private String pais;

	/**
	 * Telefone do cliente
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 40)
	private String fone;

	/**
	 * Email do cliente
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 50)
	private String email;

	/**
	 * ("S"-Sim, "N"-N�o) Atualizar os dados no cadastro do cliente, caso n�o
	 * seja informado o valor padr�o � "S" <br>
	 * Caso o cliente n�o esteja cadastrado no Tiny, o mesmo ser� inclu�do
	 * desconsiderando o valor informado.
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 1)
	@XStreamAlias("atualizar_cliente")
	private OpcaoSimNaoEnum atualizarCliente;

	public Cliente(String codigo, String nome, TipoPessoaEnum tipoPessoa,
			String cpfCnpj, String ie, String rg, String endereco,
			String numero, String complemento, String bairro, String cep,
			String cidade, String uf, String pais, String fone, String email,
			OpcaoSimNaoEnum atualizarCliente) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.tipoPessoa = tipoPessoa;
		this.cpfCnpj = cpfCnpj;
		this.ie = ie;
		this.rg = rg;
		this.endereco = endereco;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.uf = uf;
		this.pais = pais;
		this.fone = fone;
		this.email = email;
		this.atualizarCliente = atualizarCliente;
	}

	public Cliente() {
		super();
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoPessoaEnum getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(TipoPessoaEnum tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getIe() {
		return ie;
	}

	public void setIe(String ie) {
		this.ie = ie;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public OpcaoSimNaoEnum getAtualizarCliente() {
		return atualizarCliente;
	}

	public void setAtualizarCliente(OpcaoSimNaoEnum atualizarCliente) {
		this.atualizarCliente = atualizarCliente;
	}

}
