package br.com.tinyconn.util;

import java.util.List;

import br.com.cdsl.validator.validate.Message;
import br.com.cdsl.validator.validate.Validator;
import br.com.tinyconn.action.ProcessoEnvioNota;
import br.com.tinyconn.bean.ParametroServicoEnvioNota;
import br.com.tinyconn.bean.Resposta;
import br.com.tinyconn.layout.enumeration.NotaFiscalTipoEnum;
import br.com.tinyconn.layout.nota.inclusao.envio.Item;
import br.com.tinyconn.layout.nota.inclusao.envio.NotaFiscal;
import br.com.tinyconn.layout.nota.inclusao.retorno.Erro;
import br.com.tinyconn.layout.nota.inclusao.retorno.RetornoEnvioNota;

class ExemploEnvio {

	public static void main(String args[]) {

		// criação da nota
		NotaFiscal fiscal = new NotaFiscal();
		fiscal.setTipo(NotaFiscalTipoEnum.SAIDA);
		fiscal.setNaturezaOperacao("1");

		Item item = new Item();
		item.setCodigo("1");
		fiscal.addItem(item);

		try {
			List<Message> mensagens = null;
			mensagens = Validator.validate(fiscal, false);
			for (Message message : mensagens) {
				System.out.println(message.getMessage());
			}
		} catch (Exception e) {
			// ignore
		}

		String notaXml = XStreamFactory.getXmlFromObject(fiscal);
		System.out.println(notaXml);

		// criação do servico
		ParametroServicoEnvioNota param = new ParametroServicoEnvioNota();
		param.setToken("dc02cb39c100300c4915eb2174dc6dd3ab2ea5f5");
		param.setNota(notaXml);
		param.setFormato("xml");

		ProcessoEnvioNota envio = new ProcessoEnvioNota();
		try {
			Resposta resposta = envio.executar(param);
			RetornoEnvioNota retorno = (RetornoEnvioNota) resposta;
			if (retorno.getRegistros().get(0).getErros() != null) {
				for (Erro erro : retorno.getRegistros().get(0).getErros()) {
					for (String message : erro.getErros()) {
						System.out.println(message);
					}
				}
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}

	}

}
