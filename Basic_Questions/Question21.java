package Basic_Questions;
import java.util.Scanner;

// Prime Factors of a Number

public class Question21 {
    
    public static void primeFactorsOfNumber(int num) {
        
        for(int i = 1; i <= num; i++) {

            if(num % i == 0 && isPrime(i)) {
                System.out.println(i + " ");
            }
        }
    }

    public static boolean isPrime(int num) {

        int count = 0;
        
        for(int i = 1; i <= num/2; i++) 
            if(num % i == 0) count++;

        count++; // To include the number in the factors count
        return count <= 2;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        primeFactorsOfNumber(num);

        sc.close();
    }
}
