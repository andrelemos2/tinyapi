package br.com.tinyconn.util;

import br.com.tinyconn.action.ProcessoEmiteNota;
import br.com.tinyconn.bean.ParametroServico;
import br.com.tinyconn.layout.enumeration.OpcaoSimNaoEnum;
import br.com.tinyconn.layout.nota.emissao.retorno.RetornoEmissaoNota;
import br.com.tinyconn.layout.nota.inclusao.retorno.Erro;

public class ExemploEmissao {

	public static void main(String args[]) {

		ProcessoEmiteNota emite = new ProcessoEmiteNota();
		try {

			ParametroServico parametroServico = emite.getParametroServico(
					"dc02cb39c100300c4915eb2174dc6dd3ab2ea5f5", 1, "11", null,
					OpcaoSimNaoEnum.NAO, "xml");

			String resposta = emite.enviar(parametroServico);
			System.out.println(resposta);

			RetornoEmissaoNota retorno = (RetornoEmissaoNota) emite.lerRetorno(resposta);
			for (Erro erro : retorno.getErros()) {
				for (String message : erro.getErros()) {
					System.out.println(message);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
