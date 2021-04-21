package com.company;

import java.util.Scanner;

public class PodzielnaPrzez3 {
    public static void main(String[] args) {

        System.out.println("Podaj dowolną liczbę ");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();

        if (liczba % 3 == 0) {
            System.out.println("Liczba jest podzielna przez 3");
        } else {
            System.out.println("Liczba jest podzielna przez 3, ale pozostaje reszta z dzielenia");
        }
    }
}
