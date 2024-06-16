import java.util.Scanner;

// Can a number be expressed as a sum of two prime numbers

public class Question45 {

    public static boolean isPrime(int num) {
        if(num == 1) {
            return false;
        }

        for(int i = 2; i <= Math.sqrt(num); i++) {

            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void expressAsSumOfTwoPrimes(int num) {

        boolean canExpress = false;
        
        for(int i = 2; i <= num/2; i++) {

            if(isPrime(i) && isPrime(num - i)) {
                System.out.println(num + " = " + i +", " + ( num - i));
                canExpress = true;
            }
        }

        if(!canExpress) {
            System.out.println("Cannot be expressed as a sum of two primes..");
        }
    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        expressAsSumOfTwoPrimes(num);

        sc.close();
    
    }
    
    /*      Approach 
     *      1) Loop from i = 2 to i <= num/2
     *      2) Check if i && num - i are prime, then print them and change the value of flag
     *      3) Check flag
     */
}