package com.company;

import java.util.Scanner;

public class CzyZawieraCiagLiter {
    public static void main(String[] args) {

        Scanner skanuj = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String nowy = skanuj.next();

        if (nowy.contains("kajak")){
            System.out.println("Podany wyraz zawiera ciag liter");
        }else {
            System.out.println("Podany wyraz nie zawiera ciagu liter");
        }
    }
}
