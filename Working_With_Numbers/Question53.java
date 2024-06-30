import java.util.Scanner;

// Count the numbers which has the given number of divisors / factors

public class Question53 {

    public static int numbersWithGivenNumber_of_divisors(int start, int end, int n) {
        
        int count = 0;
        for(int i = start; i <= end; i++) {
            if(countFactors(i) == n) {
                count++;
            }
        }
        return count;
    }

    public static int countFactors(int num) {

        // corner case
        if(num == 1)
             return 1;

        int count = 0;

        for(int i = 1; i <= Math.sqrt(num); i++) {
            if(num % i == 0)
                count++;
        }
        return count + 1;
    }
    
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int no_of_divisors = sc.nextInt();

        System.out.println(numbersWithGivenNumber_of_divisors(start, end,  no_of_divisors));

        sc.close();

    }

}