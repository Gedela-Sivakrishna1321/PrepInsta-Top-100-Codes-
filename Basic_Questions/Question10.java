package Basic_Questions;
import java.util.Scanner;

// Prime Numbers in range 

public class Question10 {

    public static void primesInRange(int lower, int upper) {

        for(int i = lower; i <= upper; i++) {
            
            // Skip for num = 1
            if(i == 1) {
                continue;
            }
            
            int num = i;
            boolean isPrime = true;
            for(int j = 2; j <= Math.sqrt(num); j++) {
                if(num % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                System.out.print(num + " ");
        }
    }
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int lower = sc.nextInt();
        int upper = sc.nextInt();

        primesInRange(lower, upper);

        sc.close();
    }
}
