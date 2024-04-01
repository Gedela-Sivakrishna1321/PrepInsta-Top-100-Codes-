package Basic_Questions;
import java.util.Scanner;

/* Check if a Number is Positive or Negative */

public class Question1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // Approach 1 - Using Terenary Operator 
        String result = ((num == 0) ? "Zero" : ((num > 0) ? "Positive Number" : "Negative Number"));
        System.out.println(result);

        // Approach 2 - If else statements
        if(num == 0) {
            System.out.println("Zero");
        }
        else if (num > 0) {
            System.out.println("Positive Number");
        }
        else {
            System.out.println("Negative Number");
        }

        sc.close();
    }
}