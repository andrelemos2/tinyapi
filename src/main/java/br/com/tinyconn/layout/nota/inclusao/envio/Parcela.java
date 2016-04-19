package br.com.tinyconn.layout.nota.inclusao.envio;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import br.com.cdsl.annotations.field.Range;
import br.com.cdsl.annotations.field.Size;
import br.com.tinyconn.exception.TamanhoInvalidoException;
import br.com.tinyconn.exception.ValorInvalidoException;
import br.com.tinyconn.layout.nota.BeanLayoutNota;

/**
 * Lista de parcelas da nota<br>
 * Elemento utilizado para representar uma parcela da nota
 * 
 * @author Andre
 *
 */
@XStreamAlias("parcela")
public class Parcela implements BeanLayoutNota {

	/**
	 * Dias de Vencimento da Parcela
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 18)
	@Range(exception = ValorInvalidoException.class, max = "20")
	private Integer dias;

	/**
	 * Data de Vencimento da Parcela<br>
	 * Estes campos dever ser informado no formato dd/mm/yyyy, exemplo
	 * "01/01/2012".
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 10)
	private String data;

	/**
	 * Valor da parcela <br>
	 * Estes campos utilizam "." (ponto) como separador de decimais, exemplo
	 * "5.25".
	 */
	@Range(exception = ValorInvalidoException.class, min = "0")
	private String valor;

	/**
	 * Observa��o da parcela
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 100)
	private String obs;

	/**
	 * Destino da parcela (Ex:Caixa, Contas a Receber), por padr�o as parcelas
	 * v�o para contas a receber
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 50)
	private String destino;

}
