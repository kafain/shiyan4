package example;

import weather.WeatherWSLocator;
import weather.WeatherWSSoap_PortType;

import java.util.Scanner;

public class HelloWorldClient {
  public static void main(String[] argv) {
    try {
      WeatherWSLocator locator = new WeatherWSLocator();

      WeatherWSSoap_PortType port = locator.getWeatherWSSoap();
      Scanner sc = new Scanner(System.in);
      System.out.println("请输入你想查询的城市");
      String city =sc.nextLine();
      String[] body = port.getWeather(city,null);
      for(String w:body){
        System.out.println(w);
      }
    } catch (javax.xml.rpc.ServiceException ex) {
      ex.printStackTrace();
    } catch (java.rmi.RemoteException ex) {
      ex.printStackTrace();
    }  
  }
}
