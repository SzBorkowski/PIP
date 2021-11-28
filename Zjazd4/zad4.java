package com.cw4;

import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Podaj numer miesiąca: ");
        byte miesiac = scan.nextByte();
        switch(miesiac){
            case 1:
                System.out.print("Wybrałeś styczeń.");
                break;
            case 2:
                System.out.print("Wybrałeś luty.");
                break;
            case 3:
                System.out.print("Wybrałeś marzec.");
                break;
            case 4:
                System.out.print("Wybrałeś kwiecień.");
                break;
            case 5:
                System.out.print("Wybrałeś maj.");
                break;
            case 6:
                System.out.print("Wybrałeś czerwiec.");
                break;
            case 7:
                System.out.print("Wybrałeś lipiec.");
                break;
            case 8:
                System.out.print("Wybrałeś sierpień.");
                break;
            case 9:
                System.out.print("Wybrałeś wrzesień.");
                break;
            case 10:
                System.out.print("Wybrałeś październik.");
                break;
            case 11:
                System.out.print("Wybrałeś listopad.");
                break;
            case 12:
                System.out.print("Wybrałeś grudzień.");
                break;
        }
    }
}