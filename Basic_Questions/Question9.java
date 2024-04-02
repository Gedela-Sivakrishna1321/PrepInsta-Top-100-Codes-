package Basic_Questions;
import java.util.Scanner;

// Prime Number Program 

public class Question9 {

    public static boolean isPrime(int num) {
        // Base case
        if(num == 1)
            return false;
        
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0)
                return false;
        }
        return true;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(isPrime(num)) {
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Not a Prime Number");
        }

        sc.close();
    }
}
