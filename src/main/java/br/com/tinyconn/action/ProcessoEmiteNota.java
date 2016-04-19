package br.com.tinyconn.action;

import java.util.LinkedHashMap;
import java.util.Map;

import br.com.cdsl.validator.validate.Validator;
import br.com.tinyconn.ConnFactory;
import br.com.tinyconn.bean.ParametroServico;
import br.com.tinyconn.bean.ParametroServicoEmitirNota;
import br.com.tinyconn.bean.Resposta;
import br.com.tinyconn.layout.enumeration.OpcaoSimNaoEnum;
import br.com.tinyconn.layout.nota.emissao.retorno.RetornoEmissaoNota;
import br.com.tinyconn.util.XStreamFactory;

public class ProcessoEmiteNota implements NotaAction {

	public Resposta executar(ParametroServico parametroServico)
			throws Exception {
		String resposta = enviar(parametroServico);
		return lerRetorno(resposta);
	}

	public String enviar(ParametroServico parametroServico) {
		ParametroServicoEmitirNota param = (ParametroServicoEmitirNota) parametroServico;
		Map<String, String> parametros = new LinkedHashMap<String, String>();
		parametros.put("token", param.getToken());
		parametros.put("id", param.getId().toString());
		parametros.put("serie", param.getSerie());
		parametros.put("numero", param.getNumero());
		parametros.put("enviarEmail", param.getEnviarEmail().toString());
		parametros.put("formato", param.getFormato());

		String response = null;
		try {
			response = new ConnFactory().connect(ActionEnum.EMITIR_NOTA,
					parametros);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}

	public Resposta lerRetorno(String xml) {
		XStreamFactory.getInstance().alias("retorno", RetornoEmissaoNota.class);
		Object object = XStreamFactory.getInstance().fromXML(xml);
		RetornoEmissaoNota retorno = (RetornoEmissaoNota) object;
		return retorno;
	}

	public ParametroServico getParametroServico(String token, Integer id,
			String serie, String numero, OpcaoSimNaoEnum enviarEmail,
			String formato) throws Exception {

		ParametroServico parametro = new ParametroServicoEmitirNota(token, id,
				serie, numero, enviarEmail, formato);
		Validator.validate(parametro);
		return parametro;
	}
}
