package br.com.tinyconn.action;

import br.com.tinyconn.bean.ParametroServico;
import br.com.tinyconn.bean.Resposta;

public interface NotaAction {

	public Resposta executar(ParametroServico parametroServico)
			throws Exception;

	public String enviar(ParametroServico parametroServico);

	public Resposta lerRetorno(String xml);

}
