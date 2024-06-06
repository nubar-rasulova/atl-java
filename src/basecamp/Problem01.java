package basecamp;

import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int tam = number / 10;
        int qaliq = number % 10;
        System.out.println(tam + " " + qaliq);
    }
}
