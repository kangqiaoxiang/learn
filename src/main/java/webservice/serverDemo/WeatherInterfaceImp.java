package webservice.serverDemo;

import javax.jws.WebService;

/**
 * Created by Administrator on 2018/8/9.
 */
@WebService
public class WeatherInterfaceImp implements WeatherInterface {

    @Override
    public String queryWeather(String cityName) {
        System.out.println("获取城市名"+cityName);
        String weather="暴雨";
        return weather;
    }

}
