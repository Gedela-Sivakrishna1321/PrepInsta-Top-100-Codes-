// package Working_With_Numbers;
import java.util.Scanner;
// Binary to Decimal Conversion 

public class Question32 {

    public static int binaryToDecimal(int num) {
        int a = 1;
        int result = 0;

        while(num != 0) {
            int digit = num % 10;

            if(digit == 1)
                 result = result + digit * a;
            
            a = a * 2;
            num /= 10;
        }

        return result;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Corresponding Decimal Number - " + binaryToDecimal(num));

        sc.close();
    }
}
