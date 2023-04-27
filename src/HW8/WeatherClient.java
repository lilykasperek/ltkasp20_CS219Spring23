package HW8;
import Utility.Util;
import ZipCodes.ZipCode;
import ZipCodes.ZipCodeDB;

import java.util.Scanner;

public class WeatherClient implements WeatherClientInterface {

    public WeatherClient() {
    }

    @Override
    public WeatherObservation getWeather(ZipCode code) {
        double lat = code.getCoord().getLat();
        double lng = code.getCoord().getLng();
        String url = "http://api.geonames.org/findNearByWeatherJSON?formatted=true&lat="+lat+"&lng=-"+lng+"&username=edharcourt";
        Scanner s = Util.openSite(url);
        String cloud = "";
        String temp = "";
        String humidity = "";
        String windspeed = "";

        for (int i = 0; i < 15; i++) {
            String line = s.nextLine();
            if (i == 5) {
                cloud = line.substring(line.indexOf(":")+3, line.length()-2);
            } else if (i == 10) {
                temp = line.substring(line.indexOf(":")+3, line.length()-2);
            }
            else if (i == 11) {
                humidity = line.substring(line.indexOf(":")+2, line.length()-1);
            }
            else if (i == 14) {
                windspeed = line.substring(line.indexOf(":")+2, line.length()-1);
            }
        }
        return new WeatherObservation( Double.parseDouble(temp), Double.parseDouble(windspeed), Double.parseDouble(humidity), cloud);
    }
}
