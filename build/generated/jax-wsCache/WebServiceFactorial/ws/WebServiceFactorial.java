
package ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WebServiceFactorial", targetNamespace = "http://WS/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WebServiceFactorial {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://WS/", className = "ws.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://WS/", className = "ws.HelloResponse")
    @Action(input = "http://WS/WebServiceFactorial/helloRequest", output = "http://WS/WebServiceFactorial/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param number
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "factorial", targetNamespace = "http://WS/", className = "ws.Factorial")
    @ResponseWrapper(localName = "factorialResponse", targetNamespace = "http://WS/", className = "ws.FactorialResponse")
    @Action(input = "http://WS/WebServiceFactorial/factorialRequest", output = "http://WS/WebServiceFactorial/factorialResponse")
    public int factorial(
        @WebParam(name = "number", targetNamespace = "")
        int number);

}
