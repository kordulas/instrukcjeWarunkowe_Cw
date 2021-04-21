package com.company;

import java.util.Scanner;

public class TrzyLiczbyWypisujeNajmniejsza {
    public static void main(String[] args) {

        System.out.println("Wprowadz pierwsza liczbe");
        Scanner pierwszy = new Scanner(System.in);
        int jeden = pierwszy.nextInt();
        System.out.println("Wprowadz druga liczbe");
        Scanner drugi = new Scanner(System.in);
        int dwa = drugi.nextInt();
        System.out.println("Wprowadz trzecia liczbe");
        Scanner trzeci = new Scanner(System.in);
        int trzy = trzeci.nextInt();

        if (jeden < dwa && dwa <= trzy){
            System.out.println("Najmniejsza liczba to liczba numer jeden" + " " + jeden);
        } else if (dwa < jeden && jeden <= trzy){
            System.out.println("Najmniejsza liczba to liczba numer dwa " + " " +dwa);
        } else {
            System.out.println("Najmniejsza liczba to liczba numer trzy " + " " + trzy);
        }
    }
}
