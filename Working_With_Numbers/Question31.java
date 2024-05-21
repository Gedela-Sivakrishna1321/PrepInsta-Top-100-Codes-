package Working_With_Numbers;
import java.util.Scanner;
// GCD ( Greatest Common Divisor) - This is same as HCF

public class Question31 {

    public static int gcd(int num1, int num2) {

        while(num1 != num2) {
            if(num1 > num2) {
                num1 = num1 - num2;
            }
            else {
                num2 = num2 - num1;
            }
        }

        return num2;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("GCD is : " + gcd(num1, num2));

        sc.close();
    }
    
}
