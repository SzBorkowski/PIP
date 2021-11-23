import java.util.Scanner;

public class zad1 {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.print("Podaj imię: ");
    String imie = scan.nextLine();
    System.out.print("Podaj nazwisko: ");
    String nazwisko = scan.nextLine();
    System.out.print("Podaj płeć (kobieta/mężczyzna): ");
    String plec = scan.nextLine();
    wypisz (plec, imie, nazwisko);
}

    public static void wypisz(String plec, String imie, String nazwisko) {
        String napis = " ";
        if (plec.equals("mężczyzna")) {
            napis = napis + "Student: ";
        } else if (plec.equals("kobieta")) {
            napis = napis + "Studentka: ";
        } else {
            napis = napis + " ";
        }

        napis = napis + " " + imie + " " + nazwisko;
        System.out.print(napis);
    }
}