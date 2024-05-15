package Basic_Questions;
import java.util.Scanner;

// Automorphic Number - The number when squared ends with the same number is known as Automorphic Number
/*    Examples :- 5 = (5)^2 = 25️⃣  
 *               25 = (25)^2 = 62️⃣5️⃣
 *                1 = (1)^2 = 1️⃣
 *               76 = (76)^2 = 377️⃣6️⃣
 */

public class Question25 {
    
    public static boolean isAutomorphicNumber(int num) {

        int numSq = num * num;

        int count = countDigits(num);

        return (numSq % Math.pow(10, count)) == num;
    }

    public static int countDigits(int num) {
        
        int count = 0;

        while(num != 0) {
            count++;
            num /= 10;
        }

        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isAutomorphicNumber(num));

        sc.close();
    }
}
