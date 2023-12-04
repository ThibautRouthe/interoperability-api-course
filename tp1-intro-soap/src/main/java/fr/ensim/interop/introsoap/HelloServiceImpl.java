package fr.ensim.interop.introsoap;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloServiceImpl implements HelloService {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * fr.ensim.interop.introsoap.HelloService#hello(java.lang.String)
	 */
	@Override
	@WebMethod
	public String hello(String name) {
		return "Hello " + name + " !";
	}

}
