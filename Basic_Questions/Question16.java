package Basic_Questions;
import java.util.Scanner;

// Fibonacci series

public class Question16 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int term1 = 0;
        int term2 = 1;
        int nxtTerm = 0;

        System.out.print(term1 + " ");
        System.out.print(term2 + " ");

        for(int i = 2; i < num; i++) { // Linear Complexity - O(n)
            nxtTerm = term1 + term2;
            term1 = term2;
            term2 = nxtTerm;
            System.out.print(nxtTerm + " ");
        }

        sc.close();
    }
}