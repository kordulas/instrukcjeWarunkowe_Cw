package com.company;

import java.util.Scanner;

public class PodzielnaPrzez35 {
    public static void main(String[] args) {

        Scanner skanuj = new Scanner(System.in);
        System.out.println("Podaj liczbe");;
        int liczba = skanuj.nextInt();

        if (liczba%3 == 0 && liczba%5 == 0){
            System.out.println("liczba jest podzielna przez 3 i 5");
        }else {
            System.out.println("Liczba nie jest podzielna przez 3 i 5");
        }
    }
}
