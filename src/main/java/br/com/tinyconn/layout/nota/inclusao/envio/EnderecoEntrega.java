package br.com.tinyconn.layout.nota.inclusao.envio;

import br.com.cdsl.annotations.field.Size;
import br.com.tinyconn.exception.TamanhoInvalidoException;
import br.com.tinyconn.layout.enumeration.TipoPessoaEnum;
import br.com.tinyconn.layout.nota.BeanLayoutNota;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Elemento utilizado para representar o endere�o de entrega, caso seja
 * diferente do endere�o do cliente
 * 
 * @author Andre
 *
 */
@XStreamAlias("endereco_entrega")
public class EnderecoEntrega implements BeanLayoutNota {

	/**
	 * Tipo de pessoa (F - F�sica, J - Jur�dica, E - Estrangeiro)
	 */
	@XStreamAlias("tipo_pessoa")
	private TipoPessoaEnum tipoPessoa;

	/**
	 * CPF ou CNPJ de entrega <br>
	 * Estes campos s�o utilizados para pesquisar se o cliente est� cadastrado,
	 * caso esteja os demais campos s�o carregados do cadastro.
	 */
	@XStreamAlias("cpf_cnpj")
	@Size(exception = TamanhoInvalidoException.class, max = 18)
	private String cpfCnpj;

	/**
	 * Endere�o de entrega
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 50)
	private String endereco;

	/**
	 * N�mero do endere�o de entrega
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 10)
	private String numero;

	/**
	 * Complemento do endere�o de entrega
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 50)
	private String complemento;

	/**
	 * Bairro de entrega
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 20)
	private String bairro;

	/**
	 * Cep de entrega
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 10)
	private String cep;

	/**
	 * Nome da cidade de entrega conforme a Tabela de Cidades
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 30)
	private String cidade;

	/**
	 * UF de entrega
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 30)
	private String uf;

	/**
	 * Telefone de entrega
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 40)
	private String fone;

	public EnderecoEntrega(TipoPessoaEnum tipoPessoa, String cpfCnpj,
			String endereco, String numero, String complemento, String bairro,
			String cep, String cidade, String uf, String fone) {
		super();
		this.tipoPessoa = tipoPessoa;
		this.cpfCnpj = cpfCnpj;
		this.endereco = endereco;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.uf = uf;
		this.fone = fone;
	}

	public EnderecoEntrega() {
		super();
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

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

}
