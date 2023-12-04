package fr.ensim.interop.introsoap;

import javax.xml.ws.Endpoint;

/**
 * Lanceur simplifié d'un web service SOAP hors conteneur web.
 *
 */
public class HelloServiceRunner {
	public static void main(String[] args) {
		String url = "http://localhost:0808/HelloService";
		System.out.println("Web service disponible sur l'adresse " + url);
		Endpoint.publish(url, new HelloServiceImpl());
	}
}
