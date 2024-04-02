package Basic_Questions;
import java.util.Scanner;

// Reverse a Number

public class Question12 {

    public static int reverseNum(int num) {

        int rev = 0;

        while(num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        return rev;
    }
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(reverseNum(num));

        sc.close();
    }
}
