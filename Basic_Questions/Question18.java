package Basic_Questions;
import java.util.Scanner;

// Factorial of  Number
public class Question18 {

    public static int fact(int num) {
        // Base case
        if(num == 1) {
            return num;
        }
        return num * fact(num -1);
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Factorial of " + num + " is : " + fact(num));

        sc.close();
    }
}
