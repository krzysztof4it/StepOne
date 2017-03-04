package com.pl.krzysztof4it;

import java.util.Scanner;

/**
 * Created by Krzysztof on 2017-03-04.
 */
public class Zadanie4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę 1 : "); //
        int number1 = input.nextInt(); // wpisanie 1
        System.out.println("Podaj liczbę 2 : "); //
        int number2 = input.nextInt(); // wpisanie 2
        System.out.println("Podaj liczbę 3 : "); //
        int number3 = input.nextInt(); // wpisanie 3

        //System.out.println("Metoda IF: ");


        if (number1 < number2){
            if (number1<number3){
                System.out.println("Najmniejsza jest liczba 1 = " + number1);
            }
            else
                System.out.println("Najmniejsza jest liczba 3 = " + number3);
        }
        else {
            if (number2<number3) {
                System.out.println("Najmniejsza jest liczba 2 = " + number2);
            }
            else{
                    System.out.println("Najmniejsza jest liczba 3 = " + number3);
                }
            }

            // IF z warunkami

        if (number1 < number2 && number1< number3){
            System.out.println("Najmniejsza jest liczba 1 = " + number1);
        }
        else if( number2< number1 && number2<number3){
                System.out.println("Najmniejsza jest liczba 2 = " + number2);
        }
        else{
            System.out.println("Najmniejsza jest liczba 3 = " + number3);
        }
        }

}
