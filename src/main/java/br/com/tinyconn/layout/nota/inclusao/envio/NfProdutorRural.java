package br.com.tinyconn.layout.nota.inclusao.envio;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import br.com.cdsl.annotations.field.Size;
import br.com.tinyconn.exception.TamanhoInvalidoException;
import br.com.tinyconn.layout.nota.BeanLayoutNota;

/**
 * Elemento utilizado para representar a nota fiscal de referencia do produtor
 * rural
 * 
 * @author Andre
 *
 */
@XStreamAlias("nf_produtor_rural")
public class NfProdutorRural implements BeanLayoutNota {

	/**
	 * S�rie da nota fiscal do produtor
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 3)
	private String serie;

	/**
	 * N�mero da nota fiscal do produtor
	 */
	@Size(exception = TamanhoInvalidoException.class, max = 10)
	private String numero;

	/**
	 * Ano e m�s da emiss�o da nota no formato AAMM
	 */
	@XStreamAlias("ano_mes_emissao")
	@Size(exception = TamanhoInvalidoException.class, max = 4)
	private String anoMesEmissao;

}
