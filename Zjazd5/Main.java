package com.cw5;

public class Main {

    public static void main(String[] args) {//testowanie metod
        int[] tab={1, 2, 3};
        int[] tab2={1, 2, 3};
        double[] tab3={1, 2, 3};
        wypisz(revert(tab));        //zad1
        System.out.print("\n");
        arrayToString(tab);         //zad2
        System.out.print("\n");
        getEven(tab);               //zad3
        System.out.print("\n");
        arrayEquals(tab, tab2);     //zad4
        System.out.print("\n");
        wypisz(tab);                //zad5
        System.out.print("\n");
        isInArray(tab3, 0);     //zad6
        System.out.print("\n");
        getAlgebraicMean(tab3);      //zad7
        System.out.print("\n");
        isIncreasing(tab);           //zad8
    }

    //zad1
    public static int[] revert(int[] arr){
        int[] tab = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            tab[arr.length - i - 1] = arr[i];
        }
            return tab;
    }

    //zad2
    public static String arrayToString(int[] arr){
        int[] tab = new int[arr.length];

        String wynik = "";
        for (int i = 0; i < arr.length; i++) {
            wynik += arr[i];
            if (i!=arr.length-1){
                wynik += ",";
            }
        }
        System.out.print("\"" + wynik + "\"");
        return wynik;
    }

    //zad3
    public static int[] getEven(int[] arr){
        int parzyste = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                parzyste++;
            }
        }
            int i2 = 0;
            int tab[] = new int[parzyste];
            for (int i = 0; i < arr.length; i++){
                if(arr[i]%2==0) {
                    tab[i2] = arr[i];
                    i2++;
                }
            }
            System.out.print(arr[i2]);
        return tab;
    }

    //zad4
    public static boolean arrayEquals(int[] arr, int[] arr2){
        boolean czyRowne = false;
        if (arr.length != arr2.length){
            czyRowne = false;
        } else {
            for (int i = 0; i < arr.length; i++){
                if (arr[i] != arr2[i]){
                    czyRowne = false;
                    break;
                } else {
                    czyRowne = true;
                }
            }
        }
        System.out.print(czyRowne);
        return czyRowne;
    }

    //zad5
    public static void wypisz(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }

    //zad6
    public static boolean isInArray(double[] arr, double num) {
        boolean czyNalezy = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                czyNalezy = true;
                break;
            }
        }
        System.out.print(czyNalezy);
        return czyNalezy;
    }

    //zad7
    public static double getAlgebraicMean(double[] arr){
        double srednia = 0;
        for(int i=0; i<arr.length; i++){
            srednia += arr[i]/ arr.length;
        }
        System.out.print(srednia);
        return srednia;
    }

    //zad8 przetestować dla jednoelementowej tablicy
    public static boolean isIncreasing(int[] arr){
        boolean czyNiemalejaco = false;
        if(arr.length == 1){
            czyNiemalejaco = false;
        }else if(arr[0] > arr[1]){
            czyNiemalejaco = false;
        } else {
            for(int i =1; i <arr.length; i++){
                if(arr[i] >= arr[i-1]){
                    czyNiemalejaco = true;
                } else {
                    czyNiemalejaco = false;
                }
            }
        }
        System.out.print(czyNiemalejaco);
        return czyNiemalejaco;
    }
}