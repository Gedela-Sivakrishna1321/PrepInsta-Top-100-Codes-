package Basic_Questions;
import java.util.Scanner;

// ArmStrong Number

public class Question14 {

    public static int numberOfDigits(int num) {

        int count = 0;

        while(num != 0) {
            count++;
            num /= 10;
        }

        return count;
    }

    public static boolean isArmStrong(int num) {
        // Find out n.o of digits
        int digits = numberOfDigits(num);

        double rev = 0;
        int temp = num;

        while(temp != 0) {
            int digit = temp % 10;
            rev = rev + Math.pow(digit, digits);
            temp /= 10;
        }

        return rev == num;
    }
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(isArmStrong(num) ? "Armstrong Number" : "Not an Armstrong Number");

        sc.close();
    }
}
