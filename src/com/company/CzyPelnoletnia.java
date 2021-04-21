package com.company;

import java.util.Scanner;

public class CzyPelnoletnia {
    public static void main(String[] args) {

        System.out.println("Podaj wiek");
        Scanner skanuj = new Scanner(System.in);
        int wiek = skanuj.nextInt();

        if (wiek >= 18){
            System.out.println("Jestes pelnoletni/a");
        } else{
            System.out.println("Jestes niepelnoletni/a");
        }
    }
}
