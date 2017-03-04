package com.pl.krzysztof4it;

import java.util.Scanner;

/**
 * Created by Krzysztof on 2017-03-04.
 */
public class Loops {

    public static void main(String[] args) {

        /*
        for ( int i = 0; i< 10; i++){
            System.out.println(i);
        }

        */

        for (int i = 10; i >=0; i-=2){
            System.out.println("Co druga liczba " + i );
        }

        for (int i = 0; i <5; i++){
            System.out.println("Helllo");
        }

        for (int i = 0; i <100; i++){
            if (i%7==0){
                System.out.println("Liczba podzielna przez 7 = " + i);
            }

            // zadanie
            // program wczytuje liczbę i sumije wartości

            Scanner input = new Scanner(System.in);

            int number = input.nextInt();
            int sum = 0;
            for (i = 0; i <= number; i++){
                sum+=i;
            }
            System.out.println("Suma liczby " + number + " wynosi = " + sum);
        }
    }
}
