package com.company;

import java.util.Scanner;

public class CzyPierwszaIOstatniaSaTakieSame {
    public static void main(String[] args) {

        System.out.println("Wprowadz dowolny wyraz");
        Scanner wyraz = new Scanner(System.in);
        String slowo = wyraz.next();

        char a = slowo.charAt(0);
        char b = slowo.charAt(slowo.length()-1);


        if ( a == b){
            System.out.println("Pierwsza i ostatnia litera wyrazu jest taka sama");
        } else {
            System.out.println("Pierwsza i ostatnia litera roznia sie");
        }

        /*if (slowo.startsWith(slowo.endsWith()) != slowo.endsWith(slowo.startsWith())) {
            System.out.println("Pierwsza i ostatnia litera roznia sie");
        } else {
            System.out.println("Pierwsza i ostatnia litera wyrazu jest taka sama");
        }*/

    }
}
