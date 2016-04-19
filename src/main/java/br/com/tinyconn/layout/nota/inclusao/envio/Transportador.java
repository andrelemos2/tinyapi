package br.com.tinyconn.layout.nota.inclusao.envio;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import br.com.cdsl.annotations.field.Size;
import br.com.tinyconn.exception.TamanhoInvalidoException;
import br.com.tinyconn.layout.enumeration.TipoPessoaEnum;
import br.com.tinyconn.layout.nota.BeanLayoutNota;

/**
 * Elemento utilizado para representar o transportador
 * 
 * @author Andre
 *
 */
@XStreamAlias("transportador")
public class Transportador implements BeanLayoutNota {

	/**
	 * C�digo do transportador <br>
	 * Estes campos s�o utilizados para pesquisar se o transportador est�
	 * cadastrado, caso esteja os demais campos s�o carregados do cadastro.
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 30)
	private String codigo;

	/**
	 * Nome do transportador Estes campos s�o utilizados para pesquisar se o
	 * transportador est� cadastrado, caso esteja os demais campos s�o
	 * carregados do cadastro.
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 30)
	private String nome;

	/**
	 * Tipo de pessoa (F - F�sica, J - Jur�dica, E - Estrangeiro)
	 */
	@XStreamAlias("tipo_pessoa")
	@Size(exception = TamanhoInvalidoException.class, max = 1)
	private TipoPessoaEnum tipoPessoa;

	/**
	 * CPF ou CNPJ do transportador Estes campos s�o utilizados para pesquisar
	 * se o transportador est� cadastrado, caso esteja os demais campos s�o
	 * carregados do cadastro.
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 18)
	private String cpf_cnpj;

	/**
	 * Inscri��o estadual do transportador
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 18)
	private String ie;

	/**
	 * Endere�o do transportador
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 30)
	private String endereco;

	/**
	 * Cidade do transportador, conforme Tabela de Cidades
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 30)
	private String cidade;

	/**
	 * UF do transportador
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 30)
	private String uf;

	public Transportador() {
		super();
	}

	public Transportador(String codigo, String nome, TipoPessoaEnum tipoPessoa,
			String cpf_cnpj, String ie, String endereco, String cidade,
			String uf) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.tipoPessoa = tipoPessoa;
		this.cpf_cnpj = cpf_cnpj;
		this.ie = ie;
		this.endereco = endereco;
		this.cidade = cidade;
		this.uf = uf;
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

	public String getCpf_cnpj() {
		return cpf_cnpj;
	}

	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}

	public String getIe() {
		return ie;
	}

	public void setIe(String ie) {
		this.ie = ie;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
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

}
