package com.pl.krzysztof4it;

import java.util.Scanner;

/**
 * Created by Krzysztof on 2017-03-04.
 * Zadanie 3 - ile osów w 1 rzędzie samolotu
 *
 */
public class Zadanie3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Podaj liczbę miejsc w samolocie: ");
        int sits = input.nextInt();
        System.out.println("Podaj liczbę rzędów w samolocie: ");
        int rows = input.nextInt();

        /*
        int sits, rows;
        sits = 200;
        rows = 10;
        */
        int pepoleInRow, otherRow;

        pepoleInRow = sits/rows;
        otherRow = sits%rows;

        System.out.println("Liczba osób w rzedzie : " + pepoleInRow);
        System.out.println("Liczba osób w ostatnim rzedzie : " + otherRow);



    }
}
