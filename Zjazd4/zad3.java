package com.cw4;

import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Podaj liczbę: ");
        int liczba = scan.nextInt();
        if(liczba<0)
            liczba*=-1;
        if(liczba/10==0){
            System.out.print("Liczba "+liczba+" jest jednocyfrowa.");
        }else if(liczba/100==0){
            System.out.print("Liczba "+liczba+" jest dwucyfrowa.");
        }else if(liczba/1000==0){
            System.out.print("Liczba "+liczba+" jest trzycyfrowa.");
        }else if(liczba/10000==0){
            System.out.print("Liczba "+liczba+" jest czterocyfrowa.");
        }
    }
}