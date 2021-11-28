package com.cw4;

import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj liczbę: ");
        double liczba = scan.nextDouble();
        System.out.print("Wartość funkcji signum dla " + liczba + " to " + znakLiczby(liczba));
    }

    public static int znakLiczby(double liczba) {
        if (liczba > 0)
            return 1;
        else if (liczba == 0)
            return 0;
        else if (liczba < 0)
            return -1;
        else return 0;
    }
}

