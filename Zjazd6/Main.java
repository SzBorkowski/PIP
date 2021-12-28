package com.cw6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] tab1={1,2,3};
    int[] tab2={4,5,6};
    mergeArrays(tab1,tab2);                 //zad1
    System.out.print("\n");
    int podanaLiczba = scan.nextInt();
    getFibonacci(podanaLiczba);             //zad2
        System.out.print("\n");
        scan.nextLine();
        String czyAnagram1 = scan.nextLine();
        String czyAnagram2 = scan.nextLine();
    areAnagrams(czyAnagram1,czyAnagram2);   //zad3
        System.out.print("\n");
        String czyPalindrom = scan.nextLine();
        isPalindrom(czyPalindrom);          //zad4
        System.out.print("\n");
        int n=2;
        dividers(tab1,n);                   //zad5
    }
    //zad1
    public static int[] mergeArrays(int[] arr1, int[] arr2){
        int dlugoscTablicy = arr1.length + arr2.length;
        int[] wynikowaTablica = new int[dlugoscTablicy];
        int pozycja = 0;
        for (int element : arr1){
            wynikowaTablica[pozycja] = element;
            pozycja++;
        }
        for (int element : arr2){
            wynikowaTablica[pozycja] = element;
            pozycja++;
        }
        System.out.print(Arrays.toString(wynikowaTablica));
        return wynikowaTablica;
    }
    //zad2
    public static int getFibonacci(int sequenceIndex){
        int f[] = new int[sequenceIndex + 2];
        int i;
        f[0] = 0;
        f[1] = 1;
        for (i = 2; i <= sequenceIndex; i++){
            f[i] = f[i - 1] + f[i - 2];
        }
        int szukanaLiczba = f[f.length - 2];
        System.out.print(szukanaLiczba);
        return f[sequenceIndex];
    }
    //zad3
    public static boolean areAnagrams(String s1, String s2){
        if (s1.length() != s2.length()){
            System.out.print("false");
            return false;
        }
        char[] c1 = new char[s1.length()];
        for (int i = 0; i < s1.length(); i++){
            c1[i] = s1.charAt(i);
        }
        char[] c2 = new char[s2.length()];
        for (int i = 0; i < s2.length(); i++){
            c2[i] = s2.charAt(i);
        }
        char temp;
        for (int i = 0; i <= c1.length-1; i++){
            for (int j = i + 1; j <= c1.length-1; j++){
                if (c1[j] < c1[i]){
                    temp = c1[i];
                    c1[i] = c1[j];
                    c1[j] = temp;
                }
            }
        }
        for (int i = 0; i <= c2.length-1; i++){
            for (int j = i + 1; j <= c2.length-1; j++){
                if (c2[j] < c2[i]){
                    temp = c2[i];
                    c2[i] = c2[j];
                    c2[j] = temp;
                }
            }
        }
        if (Arrays.equals(c1,c2)){
            System.out.print("true");
            return true;
        }else {
            System.out.print("false");
            return false;
        }
    }
    //zad4
    public static boolean isPalindrom(String s1){
        int pierwszyZnak = 0;
        int ostatniZnak = s1.length() - 1;
        while (pierwszyZnak < ostatniZnak){
            if(s1.charAt(pierwszyZnak) != s1.charAt(ostatniZnak)){
                System.out.print("false");
                return false;
            }
            pierwszyZnak++;
            ostatniZnak--;
        }
        System.out.print("true");
        return true;
    }
    //zad5
    public static int dividers(int[] arr, int n){
        if (n <= 0 || n % 1 != 0){
            System.out.print("Nieprawidłowa liczba n");
            return n;
        } else {
            int liczbaPodzielnych = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % n == 0) {
                    liczbaPodzielnych++;
                }
            }
            System.out.print(liczbaPodzielnych);
        return liczbaPodzielnych;
        }
    }
}
