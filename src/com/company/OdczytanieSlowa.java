package com.company;

import java.util.Scanner;

public class OdczytanieSlowa {
    public static void main(String[] args) {

        System.out.println("Wpisz wyraz");
        Scanner wpisz = new Scanner(System.in);
        String wyraz = wpisz.next();

        System.out.println(wyraz.equals("Akademia"));

        System.out.println("Podaj hasło ");
        String password = wpisz.next();

        if ( password.equals("Akademia") || password.equals("akademia"))
            System.out.println("Podałeś poprawne hasło");
         else
            System.out.println("Podales bledne haslo");


    }
}
