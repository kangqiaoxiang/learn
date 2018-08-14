package webservice.serverDemo;

import javax.xml.ws.Endpoint;

/**
 * Created by Administrator on 2018/8/9.
 */
public class WeatherServer {
    public static void main(String[] args) {
        Endpoint.publish("http://127.0.0.1:12345/weather", new WeatherInterfaceImp());
    }
}
