package br.com.tinyconn.util;

import java.io.StringWriter;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.HierarchicalStreamDriver;
import com.thoughtworks.xstream.io.xml.CompactWriter;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;

/**
 * Global, uso de controle da instancia Cont�m metodo para destruir, sempre que
 * finalizar o uso
 * 
 * @author Andre
 *
 */
public class XStreamFactory {

	private static XStream x;
	private static HierarchicalStreamDriver driver;

	public static XStream getInstance() {
		if (x == null) {
			driver = new DomDriver("UTF-8", new XmlFriendlyNameCoder("__", "_"));
			x = new XStream(driver);
			x.autodetectAnnotations(true);
		}
		return x;
	}

	public static String getXmlFromObject(Object object) {
		StringWriter sw = new StringWriter();
		getInstance().marshal(object, new CompactWriter(sw));
		return sw.toString();
		//return getInstance().toXML(object);
	}

	/**
	 * Remove a referencia
	 */
	public static void destroy() {
		x = null;
	}

}
