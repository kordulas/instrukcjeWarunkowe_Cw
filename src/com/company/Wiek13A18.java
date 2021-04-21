package com.company;

import java.util.Scanner;

public class Wiek13A18 {
    public static void main(String[] args) {

        Scanner skanuj = new Scanner(System.in);
        System.out.println("Wiek pierwszej osoby");
        int a = skanuj.nextInt();
        System.out.println("Wiek drugiej osoby");
        int b = skanuj.nextInt();

        if ( a >= 13 && a <=18 && b >= 13 && b <= 18){
            System.out.println("Obydowje jestescie nastolatkami");
        } else {
            System.out.println("Nie jestescie w odpowiednim wieku");
        }
    }
}
