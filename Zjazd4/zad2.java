package com.cw4;

import java.util.Scanner;

public class zad2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą: ");
        int liczba = scan.nextInt();

        if (liczba % 2 == 0) {
            System.out.println("Liczba "+liczba+" jest podzielna przez 2.");
        }
        if (liczba % 3 == 0) {
            System.out.println("Liczba "+liczba+" jest podzielna przez 3.");
        }
        if (liczba % 5 == 0) {
            System.out.println("Liczba "+liczba+" jest podzielna przez 5.");
        }
        if (liczba % 2 != 0 && liczba % 3 != 0 && liczba % 5 != 0){
            System.out.println("Liczba "+liczba+" nie jest podzielna przez 2, 3 oraz 5.");
        }
    }
}