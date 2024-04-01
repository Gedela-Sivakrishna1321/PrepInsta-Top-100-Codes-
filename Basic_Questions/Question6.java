package Basic_Questions;
import java.util.Scanner;

// Find Greatest of Two Numbers

public class Question6 {
    
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // Approach 1 - If - else 
        int max = 0;
        if(num1 > num2) {
            max = num1;
        }
        else {
            max = num2;
        }
        System.out.println("Greatest b/w "+num1 + " & " + num2 + " is : " + max);

        // Approach 2 - Terenary Operator
        max = (num1 > num2) ? num1 : num2;
        System.out.println("Greatest b/w "+num1 + " & " + num2 + " is : " + max);

        // Approach 3 - In Built function
        max = Math.max(num1, num2);
        System.out.println("Greatest b/w "+num1 + " & " + num2 + " is : " + max);

        sc.close();
    }
}
