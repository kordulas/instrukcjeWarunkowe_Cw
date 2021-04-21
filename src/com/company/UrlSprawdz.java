package com.company;

import java.util.Objects;
import java.util.Scanner;

public class UrlSprawdz {
    public static void main(String[] args) {

        System.out.println("Podaj wyraz");
        Scanner skanuj = new Scanner(System.in);
        String wyraz = skanuj.next();

        if (wyraz.startsWith("www.") || wyraz.startsWith("https://") || wyraz.startsWith("http://"))
        {
            System.out.println("Wprowadzony wyraz jest adersem url");
        }else {
            System.out.println("Wprowadzony wyraz nie jest adresem url");
        }


    }
}
