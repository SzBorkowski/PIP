package com.cw4;

import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj numer miesiąca: ");
        byte miesiac = scan.nextByte();
        if (miesiac>0 && miesiac<12){
            System.out.print("Do końca roku czekają Cię jeszcze miesiące: ");
        }
        switch(miesiac){
            case 1:
                System.out.print("styczeń, ");
            case 2:
                System.out.print("luty, ");
            case 3:
                System.out.print("marzec, ");
            case 4:
                System.out.print("kwiecień, ");
            case 5:
                System.out.print("maj, ");
            case 6:
                System.out.print("czerwiec, ");
            case 7:
                System.out.print("lipiec, ");
            case 8:
                System.out.print("sierpień, ");
            case 9:
                System.out.print("wrzesień, ");
            case 10:
                System.out.print("październik, ");
            case 11:
                System.out.print("listopad, grudzień.");
                break;
            case 12:
                System.out.print("Hura, to już koniec roku!");
                break;
        }
    }
}
