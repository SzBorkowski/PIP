package com.cw4;

import java.util.Scanner;

public class zad7 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        System.out.print("Podaj liczbę a: ");
        int a = scan.nextInt();
        System.out.print("Podaj liczbę b: ");
        int b = scan.nextInt();
        System.out.print("Podaj liczbę n: ");
        int n = scan.nextInt();
        if (a%n==b%n){
            System.out.print("Liczby "+a+" i "+b+" przystają do siebie modulo "+n+".");
        }else{
            System.out.print("Liczby "+a+" i "+b+" nie przystają do siebie modulo "+n+".");
        }
    }
}
