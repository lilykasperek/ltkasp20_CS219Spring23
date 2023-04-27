package HW8;

import ZipCodes.ZipCode;

public class WeatherObservation {

    private double temperature;
    private double windspeed;
    private double humidity;
    private String cloudcover;
    public WeatherObservation(double temperature, double windspeed,
                              double humidity, String cloudcover) {

        this.temperature = temperature;
        this.windspeed = windspeed;
        this.humidity = humidity;
        this.cloudcover = cloudcover;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getWindspeed() {
        return windspeed;
    }

    public double getHumidity() {
        return humidity;
    }

    public String getCloudcover() {
        return cloudcover;
    }


    public void weatherReport(ZipCode code) {
        System.out.println("The temperature in " + code.getCity() + "," +
                code.getState() + " is " + c2f(temperature) + " degrees Fahrenheit");
        System.out.println("Wind speed is " + windspeed + " knots, humidity " + humidity + "%");
        System.out.println("Cloud cover: " + cloudcover);
    }
    public static double c2f(double c) {
        return 9.0/5.0 * c + 32;
    }

}
