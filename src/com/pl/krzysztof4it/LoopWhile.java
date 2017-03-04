package com.pl.krzysztof4it;

/**
 * Created by Krzysztof on 2017-03-04.
 * Loops While and Do While
 */
public class LoopWhile {

    public static void main(String[] args) {

        int i = 0;
        while ( i < 20){
            System.out.println("i jest równe  = " + i);
            i++;
        }

        do {
            System.out.println("Do while i = " + i);
        }while (i> 20);
    }
}
