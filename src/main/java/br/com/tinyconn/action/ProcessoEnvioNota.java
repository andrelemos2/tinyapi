package br.com.tinyconn.action;

import java.util.LinkedHashMap;
import java.util.Map;

import br.com.cdsl.validator.validate.Validator;
import br.com.tinyconn.ConnFactory;
import br.com.tinyconn.bean.ParametroServico;
import br.com.tinyconn.bean.ParametroServicoEnvioNota;
import br.com.tinyconn.bean.Resposta;
import br.com.tinyconn.layout.nota.inclusao.retorno.RetornoEnvioNota;
import br.com.tinyconn.util.XStreamFactory;

public class ProcessoEnvioNota implements NotaAction {

	public Resposta executar(ParametroServico parametroServico)
			throws Exception {
		String retorno = enviar(parametroServico);
		return lerRetorno(retorno);
	}

	public ParametroServico getParametroServico(String token,
			String notaFiscal, String formato) throws Exception {

		ParametroServico param = new ParametroServicoEnvioNota(token,
				notaFiscal, formato);
		Validator.validate(param);
		return param;
	}

	public String enviar(ParametroServico parametroServico) {
		ParametroServicoEnvioNota param = (ParametroServicoEnvioNota) parametroServico;
		Map<String, String> parametros = new LinkedHashMap<String, String>();
		parametros.put("token", param.getToken());
		parametros.put("nota", param.getNota());
		parametros.put("formato", param.getFormato());
		
		String response = null;
		try {
			response = new ConnFactory()
					.connect(ActionEnum.INCLUIR_NOTA, parametros);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}

	public RetornoEnvioNota lerRetorno(String xml) {
		XStreamFactory.getInstance().alias("retorno", RetornoEnvioNota.class);
		Object object = XStreamFactory.getInstance().fromXML(xml);
		RetornoEnvioNota retorno = (RetornoEnvioNota) object;
		return retorno;
	}
}
