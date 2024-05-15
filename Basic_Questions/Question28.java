package Basic_Questions;
import java.util.Scanner;
// Friendly Pair - Two Numbers are given, find out their factors excluding the numbers and divide the sum of factors by the numbers
//  check if the ration is same or Not 
// Exp :- 6, 28 sum of factors of 6 = 6, 28 = 28 ratio is 1 : 1 in both the cases so they are friendly pair
public class Question28 {

    public static boolean isFriendlyPair(int num1, int num2) {

        int sum1 = sumOfFactors(num1);
        int sum2 = sumOfFactors(num2);

        float ratio1 = (float)sum1 / num1;
        float ratio2 = (float)sum2 / num2;
        System.out.println(ratio1 + ", " + ratio2);

        return  ratio1 == ratio2 ;
    }

    public static int sumOfFactors(int num) {

        int sum = 0;

        for(int i = 1; i <= Math.sqrt(num); i++) {
            
            if(num % i == 0) {

                if(i == 1) {
                    sum += i;
                }
                else if (i == num / i) {
                    sum += i;
                }
                else {
                    sum += i + num / i;
                }
            }
        }

        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(isFriendlyPair(num1, num2));
        sc.close();
    }
    
}
