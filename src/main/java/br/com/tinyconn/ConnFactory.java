package br.com.tinyconn;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import br.com.tinyconn.action.ActionEnum;

public class ConnFactory {

	/**
	 * Conecta no servico construindo uma conexão de acordo com a Action
	 * 
	 * @param action
	 *            {@link ActionEnum}
	 * @param param
	 *            Map de parametros
	 * @return String resultado
	 * @throws Exception
	 */
	public String connect(ActionEnum action, Map<String, String> parametros)
			throws Exception {

		try {
			String content = "?";

			boolean first = true;
			for (String key : parametros.keySet()) {
				content += (first?"":"&") + key + "=" + parametros.get(key);
				first = false;
			}

			HttpURLConnection request = (HttpURLConnection) new URL(
					action.getEndereco() + content).openConnection();

			try {
				request.setDoOutput(true);
				request.setDoInput(true);
				request.setRequestProperty("Content-Type", "application/json");
				request.setRequestMethod("POST");
				request.connect();

				return readResponse(request);
			} finally {
				request.disconnect();
			}
		} catch (IOException ex) {
			throw new Exception(ex);
		}
	}

	private String readResponse(HttpURLConnection request) throws IOException {
		ByteArrayOutputStream os;
		try {
			InputStream is = request.getInputStream();
			os = new ByteArrayOutputStream();
			int b;
			while ((b = is.read()) != -1) {
				os.write(b);
			}
			return new String(os.toByteArray());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
