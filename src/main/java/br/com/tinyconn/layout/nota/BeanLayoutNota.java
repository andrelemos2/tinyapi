package br.com.tinyconn.layout.nota;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

import br.com.tinyconn.layout.BeanLayout;

public interface BeanLayoutNota extends BeanLayout {

	public static SimpleDateFormat FORMATO_DATA_10 = new SimpleDateFormat(
			"dd/MM/yyyy");
	public static DecimalFormat FORMATO_VALOR_4 = new DecimalFormat("00.00");

}
