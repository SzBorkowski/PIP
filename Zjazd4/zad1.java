package com.cw4;

import java.util.Scanner;

public class zad1 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Program służy do obliczenia pola figur:\n" +
                "1 - trapezu\n" +
                "2 - kwadratu\n" +
                "3 - trójkąta\n" +
                "4 - prostokąta\n" +
                "5 - rombu\n" +
                "6 - równoległoboku\n" +
                "Wybierz figurę: ");
        int opcja = scan.nextInt();
        double pole;
        switch(opcja){
            case 1:
                System.out.println("Wybrałeś trapez.");
                System.out.print("Podaj długość podstawy dolnej: ");
                double a1 = scan.nextDouble();
                System.out.print("Podaj długość podstawy górnej: ");
                double b1 = scan.nextDouble();
                System.out.print("Podaj długość wysokości: ");
                double h1 = scan.nextDouble();
                pole = poleTrapezu(a1, b1, h1);
                System.out.println("Pole jest równe "+pole);
                break;
            case 2:
                System.out.println("Wybrałeś kwadrat.");
                System.out.print("Podaj długość boku: ");
                double a2 = scan.nextDouble();
                pole = poleKwadratu(a2);
                System.out.println("Pole jest równe "+pole);
                break;
            case 3:
                System.out.println("Wybrałeś trójkąt.");
                System.out.print("Podaj długość podstawy: ");
                double a3 = scan.nextDouble();
                System.out.print("Podaj długość wysokości: ");
                double h3 = scan.nextDouble();
                pole = poleTrojkata(a3, h3);
                System.out.println("Pole jest równe "+pole);
                break;
            case 4:
                System.out.println("Wybrałeś prostokąt.");
                System.out.print("Podaj długość pierwszego boku: ");
                double a4 = scan.nextDouble();
                System.out.print("Podaj długość drugiego boku: ");
                double b4 = scan.nextDouble();
                pole = poleProstokata(a4, b4);
                System.out.println("Pole jest równe "+pole);
                break;
            case 5:
                System.out.println("Wybrałeś romb.");
                System.out.print("Podaj długość boku: ");
                double a5 = scan.nextDouble();
                System.out.print("Podaj długość wysokości: ");
                double h5 = scan.nextDouble();
                pole = poleRombu(a5, h5);
                System.out.println("Pole jest równe "+pole);
                break;
            case 6:
                System.out.println("Wybrałeś równoległobok.");
                System.out.print("Podaj długość boku: ");
                double a6 = scan.nextDouble();
                System.out.print("Podaj długość wysokości: ");
                double h6 = scan.nextDouble();
                pole = poleRownolegloboku(a6, h6);
                System.out.println("Pole jest równe "+pole);
                break;
        }
    }
    public static double poleTrapezu(double a, double b, double h){return 0.5*(a+b)*h;}
    public static double poleKwadratu(double a){
        return poleTrapezu(a, a, a);
    }
    public static double poleTrojkata(double a, double h){
        return poleTrapezu(a, 0, h);
    }
    public static double poleProstokata(double a, double h){
        return poleTrapezu(a, 0, h)*2;
    }
    public static double poleRombu(double a, double h){return poleTrapezu(a, 0, h)*2;}
    public static double poleRownolegloboku(double a, double h){return poleTrapezu(a, 0, h)*2;}
}