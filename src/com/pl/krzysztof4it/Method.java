package com.pl.krzysztof4it;

import sun.org.mozilla.javascript.internal.Function;

import java.util.Scanner;

/**
 * Created by Krzysztof on 2017-03-04.
 */
public class Method {

    public int addNumbers(int a1, int b1){
        int result = a1+b1;

        return result;

    }

    public float divNumbers( int x, int y){
        //obsługa błedu y
        if (y==0){
            throw new  IllegalArgumentException("Cannot divide by 0");

        }
        return (float) x/y;

    }

        // zadanie: wypisz true jeżeli a*a+b*b=c*c   np. dla (3,4,5)

    public boolean isPythagorasNumber(int a, int b, int c) {

        boolean numberPythagoras = false;


        if ((a * a) + (b * b) == (c * c)) {
             numberPythagoras = true;
        }
        return numberPythagoras;
    }

    public void counter(int a){
        System.out.println(a);
        if (a<10){
            counter(a+1);
        }

    }


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        Method f1 = new Method();

        /*
        int a1 = input.nextInt();
        int b2 = input.nextInt();
        */
        int addResult = f1.addNumbers(4, 5);

        //int addResult = f1.addNumbers(4, 5);
        System.out.println("Dodawanie = "+ addResult);


        /*
        try{
            divResult =f1.divNumbers()
        }catch (IllegalArgumentException e) {
            System.out.println("Wystąpił błąd");
        }
        */

        float addDiv = f1.divNumbers(4, 3);

        System.out.println("Dzielenie = " + addDiv);

        boolean numberP = f1.isPythagorasNumber(3, 4, 5);

        System.out.println(numberP);

        f1.counter(4);


    }
}
