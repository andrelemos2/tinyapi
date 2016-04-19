package br.com.tinyconn.layout.nota.inclusao.retorno;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import br.com.tinyconn.layout.nota.BeanLayoutNota;

/**
 * Cont�m a lista dos erros encontrados.
 * 
 * @author Andre
 *
 */
@XStreamAlias("erros")
public class Erro implements BeanLayoutNota {

	/**
	 * Condicional - Mensagem contendo a descri��o do erro
	 */
	@XStreamImplicit(itemFieldName = "erro")
	private List<String> erros;

	public Erro() {
		super();
	}

	public List<String> getErros() {
		return erros;
	}

	public void setErros(List<String> erros) {
		this.erros = erros;
	}


}
