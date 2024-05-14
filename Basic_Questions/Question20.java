package Basic_Questions;
import java.util.Scanner;

// Factors of a Number

public class Question20 {

    public static void recApproach(int num, int i) {
        // Base case ( The condition at which the recursion should stop)
        if(i > Math.sqrt(num)) {
            return;
        }

        // Work 
        if(num % i == 0) {
            if(i == num / i) {
                System.out.print(i + " ");
            }
            else {
                System.out.print(i + " " + num / i + " ");
            }
        }

        // Recursive Step
        recApproach(num, ++i);
    }

    // This Approach prints the factors in Jumbled Order
    // Time Complexity - O(sqrt(n)), Space Complexity - O(1)
    public static void iterativeApproach(int num) {
       
        for(int i = 1; i <= Math.sqrt(num); ++i) {
            if(num % i == 0) {

                if(i == num / i) {
                    System.out.print(i + " ");
                }
                else {
                    System.out.print(i + " " + num / i + " ");
                }
            }
        }

    }

    //This Approach prints the factors in correct order 
    // Time Complexity - O(sqrt(n)), Space Complexity - O(1)
    public static void iterativeApproachCorrectOrder(int num) {

        int i = 1;
        boolean doubleValue = false;

        for(i = 1; i <= Math.sqrt(num); i++) {
            
            // Check if the iterator divides the input number
            if(num % i == 0)
                System.out.print(i + " ");

            // Condition for checking if same factor repeating twice
            if(i == num / i) 
                doubleValue = true;
        }

        if(doubleValue) { // Checking whether same factor exists twice 
            i = i - 2;
        } else {
            i = i - 1;
        }

        // Going back from Math.sqrt to 1 and printing the factors which comes after Math.sqrt
        for( ; i >= 1; i--) {
            if(num % i == 0) {
                System.out.print(num/i + " ");
            }
        }

    }
   
    // This Approach prints the factors of negative numbers
    public static void negativeNumberFactors(int num) {
        for(int i = num; i <= Math.abs(num); i++) {
            
            
            if(i == 0 && num == 0) {
                System.out.print(0);
                break;
            }
            else if (i == 0) {
                continue;
            }

            if(Math.abs(num) % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // iterativeApproachCorrectOrder(num);
        // negativeNumberFactors(num);

        recApproach(num, 1);

        sc.close();
    }
    
}
