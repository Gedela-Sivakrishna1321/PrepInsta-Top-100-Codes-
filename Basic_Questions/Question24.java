package Basic_Questions;
import java.util.Scanner;

// Perfect Square Number 

public class Question24 {

    public static boolean isPerfectSquare(int num) {
        
        int sqrt = (int)Math.sqrt(num);

        return (sqrt * sqrt) == num;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isPerfectSquare(num));

        sc.close();
    }
}