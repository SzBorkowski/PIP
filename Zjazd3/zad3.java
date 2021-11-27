import java.util.Scanner;

public class zad3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj rok: ");
        int rok = scanner.nextInt();
        czyPrzestepny(rok);
    }

    public static boolean czyPrzestepny(int rok){
    boolean przestepnosc;
    if ((rok%4==0 && rok%100!=0)||rok%400==0) {
        przestepnosc = true;
        System.out.print("Rok "+rok+" jest rokiem przestepnym.");
    }else {
        przestepnosc = false;
        System.out.print("Rok "+rok+" nie jest rokiem przestepnym.");
    }
    return przestepnosc;
    }
}