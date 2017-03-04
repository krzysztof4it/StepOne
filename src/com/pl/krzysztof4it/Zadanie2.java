package com.pl.krzysztof4it;

import java.util.Scanner;

/**
 * Created by Krzysztof on 2017-03-04.
 */
public class Zadanie2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // deklaracja Scanera
        System.out.println("Podaj liczbę 1 : "); //
        int number1 = scanner.nextInt(); // wpisanie liczby 1
        System.out.println("Podaj liczbę 2 : ");
        int number2 = scanner.nextInt(); // wpisanie liczby 2
        System.out.println("Podaj liczbę 3 : ");
        int number3 = scanner.nextInt();
        System.out.println("Srednia liczby " + number1 + " i " + number2 + " = " + ((number1+number2)/2));


        double result, result2;
        result = (double) (number1+number2)/2;
        result2 = (double) (number1+number2+number3)/3;


        System.out.println("Wynik średniej (zmienno przecinkowa) z 2 liczb to " + result);
        System.out.println("Wynik średniej (zmienno przecinkowa) z 3 liczb to " + result2);



    }


}
