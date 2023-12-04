package fr.ensim.webservice;

import javax.xml.ws.Endpoint;

public class WebRunner {
    public static void main(String[] args) {
        String url = "http://localhost:0808/HelloService";
        System.out.println("Web service disponible sur l'adresse " + url);
        Endpoint.publish(url, new WebImpl());
    }
}
