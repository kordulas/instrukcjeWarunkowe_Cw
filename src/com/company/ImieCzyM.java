package com.company;

import java.util.Scanner;

public class ImieCzyM {
    public static void main(String[] args) {

        System.out.println("Wprowadz imie");
        Scanner imie = new Scanner(System.in);
        String name = imie.next();

        if(name.endsWith("a") && !name.equals("Kosma") && !name.equals("Kuba")){
            System.out.println("Wprowadzone imie to imie zenskie");
        }else {
            System.out.println("Wprowadzone imie to imie meskie");
        }
    }
}
