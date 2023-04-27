package HW8;

import ZipCodes.ZipCode;

public interface WeatherClientInterface {

    WeatherObservation getWeather(ZipCode code);

}
