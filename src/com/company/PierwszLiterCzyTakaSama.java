package com.company;

import java.util.Scanner;

public class PierwszLiterCzyTakaSama {
    public static void main(String[] args) {

        Scanner skanuj = new Scanner(System.in);
        System.out.println("Podaj pierwszy wyraz");
        String jeden = skanuj.next();
        System.out.println("podaj drugi wyraz");
        String drugi = skanuj.next();

        char a = jeden.toLowerCase().charAt(0);
        char b = drugi.toLowerCase().charAt(0);

        if (a == b ){
            System.out.println("wyrazy zaczynaja sie na te sama litere");
        }else {
            System.out.println("wyrazy zaczynaja sie na rozne litery");
        }
    }
}
