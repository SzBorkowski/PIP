import java.util.Scanner;

public class zad5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj tytuł pierwszego utworu: ");
        String tytul1 = scanner.nextLine();
        System.out.print("Podaj czas trwania pierwszego utworu (minuty): ");
        int min1 = scanner.nextInt();
        System.out.print("Podaj czas trwania pierwszego utworu (sekundy): ");
        int sek1 = scanner.nextInt();

        System.out.print("Podaj tytuł drugiego utworu: ");
        String tytul2 = scanner.next();
        System.out.print("Podaj czas trwania drugiego utworu (minuty): ");
        int min2 = scanner.nextInt();
        System.out.print("Podaj czas trwania drugiego utworu (sekundy): ");
        int sek2 = scanner.nextInt();

        System.out.println("---------------------------------");
        System.out.println("UTWORY:");
        ktoryDluzszy(tytul1, min1, sek1, tytul2, min2, sek2);
        czasTrwania(min1, sek1, min2, sek2);
        System.out.println("---------------------------------");
    }

    public static void ktoryDluzszy(String tytul1, int min1, int sek1, String tytul2, int min2, int sek2){
        boolean pierwszyDluzszy;
        int czas1=min1*60+sek1;
        int czas2=min2*60+sek2;
        if (czas1>=czas2){
            pierwszyDluzszy=true;
            System.out.println("1. "+tytul1+" "+min1+":"+sek1);
            System.out.println("2. "+tytul2+" "+min2+":"+sek2);
        }
        else {
            System.out.println("1. "+tytul2+" "+min2+":"+sek2);
            System.out.println("2. "+tytul1+" "+min1+":"+sek1);
        }
    }

    public static void czasTrwania(int min1, int sek1, int min2, int sek2){
        int minRazem = min1+min2;
        int sekRazem = sek1+sek2;
        if (sekRazem > 59){
            minRazem++;
            sekRazem=sekRazem-60;
        }
        System.out.println("LACZNY CZAS TRWANIA: "+minRazem+":"+sekRazem);
    }

}