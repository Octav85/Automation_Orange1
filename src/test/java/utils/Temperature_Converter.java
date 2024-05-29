package utils;

import java.util.Scanner;

public class Temperature_Converter {

    public static double convertTemperature(double temperature, String fromScale, String toScale) {

        switch (fromScale.toLowerCase()) {
            case "celsius":
                return covertFromCelsius(temperature, toScale.toLowerCase());
            case "kelvin":
                return convertFromKelvin(temperature, toScale.toLowerCase());
            case "fahrenheit":
                return convertFromFahrenheit(temperature, toScale.toLowerCase());
            default:
                throw new IllegalArgumentException("Invalid measurement scale");

        }
    }

    public static double covertFromCelsius(double temperature, String toScale) {
        switch (toScale.toLowerCase()) {
            case "celsius":
                return temperature;
            case "kelvin":
                return temperature + 273.15;
            case "fahrenheit":
                return (temperature * 9 / 5) + 32;
            default:
                throw new IllegalArgumentException("Invalid target scale: " + toScale);
        }
    }

    public static double convertFromKelvin(double temperature, String toScale) {
        switch (toScale.toLowerCase()) {
            case "celsius":
                return temperature - 273.15;
            case "kelvin":
                return temperature;
            case "fahrenheit":
                return (temperature - 273.15) * 9 / 5 + 32;
            default:
                throw new IllegalArgumentException("Invalid target scale: " + toScale);
        }
    }

    public static double convertFromFahrenheit(double temperature, String toScale) {
        switch (toScale.toLowerCase()) {
            case "celsius":
                return (temperature - 32) * 5 / 9;
            case "kelvin":
                return (temperature - 32) * 5 / 9 + 273.15;
            case "fahrenheit":
                return temperature;
            default:
                throw new IllegalArgumentException("Invalid target scale: " + toScale);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature:");
        double temperature = scanner.nextDouble();

        System.out.println("Enter the initial measurement scale (Celsius, Kelvin, Fahrenheit):");
        String fromScale = scanner.next();

        System.out.println("Enter the target scale (Celsius, Kelvin, Fahrenheit):");
        String toScale = scanner.next();

        double convertedTemperature = convertTemperature(temperature, fromScale, toScale);
        System.out.println("Converted temperature: " + convertedTemperature + " " + toScale);

        scanner.close();

    }

}

