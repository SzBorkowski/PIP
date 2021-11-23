import java.util.Scanner;

public class zad2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj miesiac: ");
        String miesiac = scanner.nextLine();

        System.out.print("Podaj rok: ");
        String rok = scanner.nextLine();

        wypisz (miesiac, rok);
    }

    public static void wypisz(String miesiac, String rok) {
        String napis = miesiac + "." + rok + " to ";
        int mies = Integer.parseInt(miesiac);
        mies /= 4;
        if (mies == 0) {
            napis += "I";
        } else if (mies == 1) {
            napis += "II";
        } else if (mies == 2) {
            napis += "III";
        } else if (mies == 3) {
            napis += "IV";
        }
        System.out.print(napis+" kwartal "+rok+" roku");
    }
}
