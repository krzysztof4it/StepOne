package com.pl.krzysztof4it;

// Szkolenie 4.03 - Podstawy


public class Main {

    public static void main(String[] args) {
	// write your code here



        int s; // deklaracja zmiennej s typu Integer
        s= 10; // Inicjalizacja zmiennej s -> przypisane wartości

        byte by; // zmienna -127 do 126 -> po przekroczeniu wartości wartość liczy leci od początku
        // np. 126+1 = -127

        //zmiana typów danych
        int a = (int) 5;

        // skrótone działania
        int sum =5;
        sum+=5;

        System.out.println(sum);


        boolean isAdult = true;
        isAdult = !isAdult; // negacja

        int sum1 = 5;
        System.out.println(sum1++);  // inkrementaca
        System.out.println(++sum1);

    }
}
