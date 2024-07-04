package basecamp;

import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int tensDigit = n / 10;
        int onesDigit = n % 10;

        int digitSum = tensDigit + onesDigit;

        int squareOfDigitSum = digitSum * digitSum;

        System.out.println(squareOfDigitSum);
    }
    }

