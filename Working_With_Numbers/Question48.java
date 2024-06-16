import java.util.Scanner;

// Prime numbers b/w 1 - 100

public class Question48 {

    public static boolean isPrime(int num) {
        if(num < 2) {
            return false;
        }
        else if (num == 2) {
            return true;
        }
        else if (num % 2 == 0) {
            return false;
        }
        else {
            for(int i = 3; i <= Math.sqrt(num); i+= 2) {
                if(num % i == 0)
                    return false;
            }

        }
        return true;
    }
    
    public static void printPrimesbw(int start, int end) {
        for(int i = start; i <= end; i++) {
            if(isPrime(i)) {
                System.out.print(i + ", ");
            }
        }

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();


        printPrimesbw(start, end);

        sc.close();
    }

}
