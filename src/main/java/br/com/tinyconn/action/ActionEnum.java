package br.com.tinyconn.action;

public enum ActionEnum {
	
	INCLUIR_NOTA("https://api.tiny.com.br/api2/nota.fiscal.incluir.php"),
	EMITIR_NOTA("https://api.tiny.com.br/api2/nota.fiscal.emitir.php");

	private String endereco;

	private ActionEnum(String endereco) {
		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}

	
}
