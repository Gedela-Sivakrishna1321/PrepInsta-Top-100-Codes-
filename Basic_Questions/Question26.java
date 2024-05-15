package Basic_Questions;
import java.util.Scanner;
// Harshad Number - The number whose sum of digits divides completly divides the number known as Harshad Number

public class Question26 {

    public static boolean isHarshadNumber(int num, int temp, int sum) {
        // Base case
        if(temp == 0) {
            return num % sum == 0;
        }

        // Work
        sum += temp % 10;

        // Recursive call
        return isHarshadNumber(num, temp/10, sum);
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isHarshadNumber(num, num, 0));

        sc.close();
    }
}
