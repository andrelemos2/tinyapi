package br.com.tinyconn.layout.nota.inclusao.retorno;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import br.com.tinyconn.layout.nota.BeanLayoutNota;

/**
 * Condicional - Elemento utilizado para representar uma nota fiscal.
 * 
 * @author Andre
 *
 */
@XStreamAlias("registro")
public class Registro implements BeanLayoutNota {

	/**
	 * N�mero sequencial utilizado para identificar cada pedido.
	 */
	private Integer sequencia;

	/**
	 * Cont�m o status do registro "OK" ou "Erro". Para o caso de conter erros
	 * estes ser�o descritos abaixo
	 */
	private String status;

	/**
	 * Conforme tabela "C�digos de erro"
	 */
	@XStreamAlias("codigo_erro")
	private Integer codigoErro;

	/**
	 * Cont�m a lista dos erros encontrados.
	 */
	@XStreamImplicit(itemFieldName = "erros")
	private List<Erro> erros;

	/**
	 * N�mero de identifica��o do nota fiscal no Tiny
	 */
	private Integer id;

	/**
	 * S�rie da nota fiscal no Tiny
	 */
	private String serie;

	/**
	 * N�mero da nota fiscal no Tiny
	 */
	private Integer numero;

	public Registro() {
		super();
	}

	public Registro(Integer sequencia, String status, Integer codigoErro,
			List<Erro> erros, Integer id, String serie, Integer numero) {
		super();
		this.sequencia = sequencia;
		this.status = status;
		this.codigoErro = codigoErro;
//		this.erros = erros;
		this.id = id;
		this.serie = serie;
		this.numero = numero;
	}

	public Integer getSequencia() {
		return sequencia;
	}

	public void setSequencia(Integer sequencia) {
		this.sequencia = sequencia;
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

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

}
