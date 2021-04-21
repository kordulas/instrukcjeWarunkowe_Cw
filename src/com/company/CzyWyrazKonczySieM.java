package com.company;

import java.util.Scanner;

public class CzyWyrazKonczySieM {
    public static void main(String[] args) {

        System.out.println("Podaj imie");
        Scanner imie = new Scanner(System.in);
        String name = imie.next();

        if (name.endsWith("M") || name.endsWith("m")){
            System.out.println("Podane imie konczy sie na litere m");
        } else {
            System.out.println("Podane imie konczy się na inna litere niz m");
        }
    }
}
