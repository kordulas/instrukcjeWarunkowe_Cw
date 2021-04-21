package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Podaj liczbę ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if( number > 5){
            System.out.println("Tak");
        } else {
            System.out.println("Nie");
        }

    }
}
