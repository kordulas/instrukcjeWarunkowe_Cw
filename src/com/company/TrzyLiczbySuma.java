package com.company;

import java.util.Scanner;

public class TrzyLiczbySuma {
    public static void main(String[] args) {

        Scanner skanuj = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe");
        int a = skanuj.nextInt();
        System.out.println("Podaj druga liczbe");
        int b = skanuj.nextInt();
        System.out.println("Podaj trzecia liczbe");
        int c = skanuj.nextInt();

        if (a + b == c){
            System.out.println("Suma pierwszych dwoch liczb daje liczbe trzecia");
        }else {
            System.out.println("Suma pierwszych dwoch liczb nie daje liczby trzeciej");
        }
    }
}
