import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class beginwith {
    public static void main(String[] args) {
        // Test 1-Write a program to print numbers from 1 to 10.
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        //Test 2- Write a program to calculate the sum of first 10 natural number.
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum" + sum);

        //Test 3 - Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.

        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println(" Musbet ededi daxil edin ");
        num = sc.nextInt();
        System.out.println("vurma" + num);
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "*" + i + "=" + num * i);
        }
        // Test 4- Write a program to find the factorial value of any number entered through the keyboard.
        // (Faktorial qiymetini tapmaq )
        Scanner sc1 = new Scanner(System.in);
        int num1;
        int fact = 1;
        System.out.println("Musbet bir ededi daxil edin ");
        num1 = sc1.nextInt();
        for (int i = 1; i <= 10; i++) {

            fact *= i;
        }
        System.out.println("Factorial" + fact);

        // Test 5

    }

}