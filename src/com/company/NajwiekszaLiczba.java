package com.company;

import java.util.Scanner;

public class NajwiekszaLiczba {
    public static void main(String[] args) {

        System.out.println("Wprowadz liczbe a");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Wprowadz liczbe b");
        int b = scanner.nextInt();
        int max = a>b ? a : b;
        System.out.println(max);

    }
}
