
package webservice.serverdemo;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WeatherInterfaceImpl", targetNamespace = "http://serverDemo.webservice/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WeatherInterfaceImpl {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "queryWeather", targetNamespace = "http://serverDemo.webservice/", className = "webservice.serverdemo.QueryWeather")
    @ResponseWrapper(localName = "queryWeatherResponse", targetNamespace = "http://serverDemo.webservice/", className = "webservice.serverdemo.QueryWeatherResponse")
    @Action(input = "http://serverDemo.webservice/WeatherInterfaceImpl/queryWeatherRequest", output = "http://serverDemo.webservice/WeatherInterfaceImpl/queryWeatherResponse")
    public String queryWeather(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
