package Basic_Questions;
import java.util.Scanner;

// Sum of Digits of a Number

public class Question11 {

    public static int sumOfDigits(int num) {

        int sum = 0;

        while(num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        return sum;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Sum of Digits in " + num + " are : " + sumOfDigits(num));

        sc.close();
    }
}
