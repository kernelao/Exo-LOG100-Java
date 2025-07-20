package exo_supp_1;

import java.util.Scanner;

public class ConvertisseurTemperature {

    public static void lancer() {

        double celsius = demanderTemperatureCelsius();
        double fahrenheit = conversionCelsiusFahrenheit(celsius);
        System.out.printf("La température %.1f celsius équivaut à %.1f fahrenheit.", celsius, fahrenheit);

    }

    public static double demanderTemperatureCelsius() {

        Scanner clavier = new Scanner(System.in);
        System.out.print("Veuillez entrer une temperature en Celsius. --->   ");

        do {
            if (clavier.hasNextDouble()) {
                return clavier.nextDouble();
            }
            clavier.next();
            System.out.print("Erreur. Vous devez entrer une valeur numérique!  --->  ");
        } while (true);
/*
        System.out.print("Veuillez entrer une temperature en Celsius. --->   ");
        while (!clavier.hasNextDouble()) {
            System.out.print("Erreur. Vous devez entrer une valeur numérique!  --->  ");
            clavier.next();
        }
*/
    }

    public static double conversionCelsiusFahrenheit(double celsius) {
        return (celsius * 1.8 + 32);
    }

}
