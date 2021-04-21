package com.company;

import java.util.Scanner;

public class DwaWyrazy {
    public static void main(String[] args) {

        Scanner skanuj = new Scanner(System.in);
        System.out.println("Podaj pierwszy wyraz");
        System.out.println("Podaj drugi wyraz");
        String pierwszy = skanuj.next();
        String drugi = skanuj.next();
        System.out.println(pierwszy.equals(drugi));
    }
}
