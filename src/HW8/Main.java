package HW8;

import ZipCodes.ZipCode;
import ZipCodes.ZipCodeDB;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ZipCodeDB DB = new ZipCodeDB();
        DB.load();
        WeatherClient wc = new WeatherClient();
        String zip = "";
        System.out.println("CS219 HW8 Weather App");
        System.out.println("Type \"quit\" to end the program.");
        System.out.print("Enter a zip code> ");
        zip = s.nextLine();
        while (!zip.equals("quit")) {
            try {
                ZipCode code = DB.bsearch(zip);
                WeatherObservation weather = wc.getWeather(code);
                weather.weatherReport(code);
                System.out.println("Type \"quit\" to end the program.");}
            catch (IndexOutOfBoundsException e) {
                System.out.println("Error: zip code " + zip + " not found");
                System.out.println("Error: Enter a valid zip code.");}
            System.out.print("Enter a zip code> ");
            zip = s.nextLine();
        }
    }
}