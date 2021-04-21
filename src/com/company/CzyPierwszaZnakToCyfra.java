package com.company;

import java.util.Scanner;

import static java.lang.Character.isDigit;

public class CzyPierwszaZnakToCyfra {
    public static void main(String[] args) {

        Scanner skanuj = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String pierwszy = skanuj.next();

        char litery[] = pierwszy.toCharArray();
        boolean jeden = Character.isDigit(litery[0]);

        if (jeden){
            System.out.println("Pierwszy znak jest liczba");
        }else {
            System.out.println("Pierwszy znak nie jest liczba");
        }

    }
}
