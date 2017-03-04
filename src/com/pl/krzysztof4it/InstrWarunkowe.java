package com.pl.krzysztof4it;

/**
 * Created by Krzysztof on 2017-03-04.
 */
public class InstrWarunkowe {

    public static void main(String[] args) {

    boolean a = true;

    int i = 5;

    if (i == 9 ){
        System.out.println("Prawda");
    }
    else {
        System.out.println("Fałsz");
    }

    ////////////////////
    boolean isActive = true;
    int balance = 1000;
    if (isActive&&balance == 1000){ // true

        System.out.println("AAAA");
    }

    if (isActive&&balance > 1000){ // true

            System.out.println("isActive&&balance > 1000");
        }

    //////////switch

        int number = 2;

    switch (number){
        case 1:
            System.out.println("WYbrałeś " + number);
            break;
        case 2:
            System.out.println("WYbrałeś " + number);
            break;

        default:
            System.out.println("WYbrałeś coś innego ");
    }

    // dla string - > tylko JAVA8
    String computerType = "Windows";
    switch (computerType){
        case "Windows":
            System.out.println("Wybrałeś PC z Windowsem");
            break;
        case "MacBook":
            System.out.println("Wybrałeś Macbooka");
            break;
        default:
            System.out.println("Inny PC");
    }


























    }
}
