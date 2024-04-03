package Basic_Questions;
import java.util.Scanner;

// Armstrong Numbers in Range

public class Question15 {

    public static int numberOfDigits(int num) {

        int count = 0;

        while(num != 0) {
            count++;
            num /= 10;
        }

        return count;
    }

    public static void armStrongNumsInRange(int lower, int upper) {

        for(int i = lower; i <= upper; i++) {
            int num = i;
            int digits = numberOfDigits(num);
            int temp = num;
            double rev = 0;
            while(temp != 0) {
                int digit = temp % 10;
                rev += Math.pow(digit, digits);
                temp /= 10;
            }
            if(num == rev)
                System.out.print(num + " ");
        }
    }
    
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int lower = sc.nextInt();
        int upper = sc.nextInt();

        armStrongNumsInRange(lower, upper);

        sc.close();
    }
}
