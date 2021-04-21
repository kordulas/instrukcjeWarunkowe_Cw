package com.company;

import javax.swing.text.MaskFormatter;
import java.util.Scanner;

public class KodPocztowy {
    public static void main(String[] args) {

        System.out.println("Podaj wyraz");
        Scanner skanuj = new Scanner(System.in);
        String wyraz = skanuj.next();

        if (wyraz.length() == 6 && Character.isDigit(wyraz.charAt(0))
        && Character.isDigit(wyraz.charAt(1)) && Character.isDigit(wyraz.charAt(3))
        && Character.isDigit(wyraz.charAt(4))
        && Character.isDigit(wyraz.charAt(5))
        && wyraz.charAt(2) == '-'){
            System.out.println("To kod pocztowy");
        } else{
            System.out.println("To nie jest kod pocztowy");
        }
    }
}
