package Working_With_Numbers;
import java.util.Scanner;
// Octal To Decimal Conversion

public class Question33 {
    
    public static int octalToDecimal(int num) {
        int a = 1;
        int result = 0;

        while(num != 0) {
            int digit = num % 10;
            result += digit * a;
            a *= 8;
            num /= 10;
        }

        return result;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Decimal Representation = " + octalToDecimal(num));

        sc.close();
    }
}
