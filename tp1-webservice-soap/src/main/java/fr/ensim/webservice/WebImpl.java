package fr.ensim.webservice;

import javax.jws.WebService;
import java.util.HashMap;
import java.util.Map;
import javax.jws.WebMethod;
@WebService
public class WebImpl {
    Map<String,Integer> requestCount = new HashMap<>();

    /*
     * (non-Javadoc)
     *
     * @see
     * fr.ensim.interop.introsoap.HelloService#hello(java.lang.String)
     */
    @Override
    @WebMethod
    public void register(String username) {
        System.out.println("username = " + username);
        if(!requestCount.containsKey(username)){
            requestCount.put(username,0);
        }
        int i = requestCount.get(username);
        i++;
        requestCount.replace(username,i);
    }
}
