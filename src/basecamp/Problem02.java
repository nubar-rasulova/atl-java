package basecamp;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Almalarin sayi");
        int alma = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Usaqların sayı ");
        int usaqlar = sc1.nextInt();

         if(alma>0 && alma < 1500 && usaqlar>0 && usaqlar<1500) {
             int birusaqucunalma = alma/usaqlar ;
             int qalanalma = alma%usaqlar;
             System.out.println( " bir usaq ucun almalar "+ birusaqucunalma+" qalan almalar "+ qalanalma);
         }
    }
}
