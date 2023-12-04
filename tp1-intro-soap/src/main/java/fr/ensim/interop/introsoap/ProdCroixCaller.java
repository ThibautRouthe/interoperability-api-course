package fr.ensim.interop.introsoap;

import javax.xml.ws.BindingProvider;

public class ProdCroixCaller {
    public static void main(String[] args) {
        // client
        HelloServiceImplService factory = new HelloServiceImplService();
        // recuperation d'une instance
        HelloService instanceClientWS = factory.getHelloServicePort();
        // positionnement du endpoint cible (l'adresse)
        BindingProvider bp = (BindingProvider) instanceClientWS;
        bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,"http://localhost:8889/HelloService");
    }
}
