import java.util.Scanner;

public class numune1 {
    //  Skanerde   Istifadecinin beden kutle indeksinin hesablanmasi
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Kilonuzu girin");
        int kilo = scanner.nextInt();
        System.out.println("Boyunuza girin ");
       double boyunuz = scanner.nextDouble();
       double  bki = kilo / (boyunuz*boyunuz);

               ;
        System.out.println("beden kutle indeksiniz"+ bki);



    }
}
