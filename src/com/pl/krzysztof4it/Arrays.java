package com.pl.krzysztof4it;

/**
 * Created by Krzysztof on 2017-03-04.
 */
public class Arrays {

    public static void main(String[] args) {


        int [] m = new  int[] {1,2,3,4,5};
        int [] n = new int[8];

        n[0] = 1; // in array n -> index 0 -> value = 1

        int size = n.length; // pobiera długość tablicy
        String[] myArray = new String[] {"a", "b", "c"};
        myArray[0] = "A";
        int a = 5;


        System.out.println(myArray[0]); // wyświetlanie elementu o index



        int[][] twoDimArray =
                {
                        {1,2,3}, // index wiersza 0
                        {4,5,6}, // index wiersza 1
                        {7,8,9}

                };

        System.out.print("tablica = [");
        for (int i= 0; i< m.length; i++){
            System.out.print(m[i]);


        }

        System.out.println(twoDimArray[1][2]);
        System.out.print("]");

        // wyświetlanie tablicy 2 wymiarowej
        for (int i = 0; i<twoDimArray.length; i++){

            for (int j=0; j<twoDimArray[i].length; j++){ // warunek tablica[i].lenhth - zwraca dłudość drugiego indeksu wartości
                System.out.print(twoDimArray[i][j]);
            }
        }
        // enhanced foor loop
        for (int k: m ){ // dla każdego elementu w
            System.out.println(k);

        }







        // zadanie -srednia i suma liczb z tablicy 1 wymiarowej

        int[] array1 = new int[] {4, 0, 5, -3, 34, 8, 32, -5};
        int sum =0 ;
        int sum1 = 0;
        double minmum1 = 0;
        int minimum = 0;
        for (int k : array1){
            sum+=k;
            if (k<minimum){
                k=minimum;
            }
        }

        for (int i =0; i<array1.length; i++){
            sum1+=array1[i];
        }
        System.out.println("Suma tablicy foreach array1 = " + sum);
        System.out.println("Suma tablicy for array1 = " + sum);
        double middle = (double) sum/array1.length;

        System.out.println("Srednia z tablicy array1 = " + middle);

        System.out.println("Najmniejsza liczba z tablicy array1 = " + minimum);
    }
}
