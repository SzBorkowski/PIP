import java.util.Scanner;

public class zad4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę sztuk: ");
        int sztuki = scanner.nextInt();
        double cena=10;
        System.out.print("Czy trwa promocja?(Tak/Nie): ");
        String promka = scanner.next();
        double razem;

        if (promka.equals("Nie")){
            cena=cena*1.1;
            razem=cena*sztuki;
            System.out.print("Cena wynosi: "+razem);
        }
        if (promka.equals("Tak")){
            if (sztuki>10){
                cena=cena/2.0;
                razem=cena*sztuki;
                System.out.print("Cena wynosi: "+razem);
            }else {
                razem=cena*sztuki;
                System.out.print("Cena wynosi: "+razem);
            }
        }
    }
}