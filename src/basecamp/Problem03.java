package basecamp;

import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Duzbucaqlinin eni ");
        int a = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println( "Duzbucaqlinin uzunlugu");
        int b = sc1.nextInt();
        if (a >= 1 && b <=1000)  {
            System.out.println( 2*(a+b));
        }
   Scanner sc2 = new Scanner(System.in);
        if (sc.hasNextInt() ) {
            int say = sc2.nextInt();
            System.out.println("Say" + say);
        }
else {
            System.out.println("Bir say girin ");
        }

    }
}
