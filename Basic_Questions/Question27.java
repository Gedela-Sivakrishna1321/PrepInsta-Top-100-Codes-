package Basic_Questions;
import java.util.Scanner;
// Abundant Number - The number in which the sum of factors excluding itself is greater then itself.
//  Exp num = 18 , factors = 1, 2, 3, 6, 9 sum = 21 which is greater then 18

public class Question27 {

    // Time Complexity - O(n)
    public static boolean isAbundantNumber(int num, int sum, int i) {
        // Base case
        if(i > num / 2) {
            return sum > num;
        }

        // Work
        if(num % i == 0)
            sum += i;

        // recursive call
        return isAbundantNumber(num, sum, i + 1);
    }
    
    // Time Complexity - O(sqrt(n))
    public static boolean isAbundantSQRoot(int num, int sum, int i) {
        // Base case
        if(i > Math.sqrt(num)) {
            return sum > num;
        }

        // Work
        if(num % i == 0) {

            if(i == 1) {
                sum += i;
            }
            else if (i == num / i) {
                sum += i;
            }
            else {
                sum += i + num/i;
            }
        }

        // Recursive call
        return isAbundantSQRoot(num, sum, i + 1);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // System.out.println(isAbundantNumber(num, 0, 1));
        System.out.println(isAbundantSQRoot(num, 0, 1));
        
        sc.close();
    }
}
