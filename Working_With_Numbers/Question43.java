// package Working_With_Numbers;
import java.util.Scanner;

// Add two Fractions

public class Question43 {

    public static String addFractions(int firstNumerator, int firstDenomenator, int secondNumerator, int secondDenomenator) {

        int newDenomenator = lcm(firstDenomenator, secondDenomenator);

        int newFirstNumerator = (newDenomenator == firstDenomenator) ? (firstNumerator) : ((newDenomenator/firstDenomenator)*firstNumerator);
        int newSecondNumerator = (newDenomenator == secondDenomenator) ? (secondNumerator) : ((newDenomenator/secondDenomenator)*secondNumerator);

        int sumNumerator = newFirstNumerator + newSecondNumerator;

        int hcf = hcf(sumNumerator, newDenomenator);

        sumNumerator = sumNumerator / hcf;
        newDenomenator = newDenomenator / hcf;
        
        if(newDenomenator == 1) { // When denomenator is 1, No need to print it
            return sumNumerator + "";
        }

        return sumNumerator + "/" + newDenomenator;
    }

    public static int hcf(int num1, int num2) {
        // Base case
        if(num1 == num2) {
            return num1;
        }

        if(num1 > num2) {
            num1 = num1 - num2;
        }
        else {
            num2 = num2 - num1;
        }
       return hcf(num1, num2);
    }

    public static int lcm(int num1, int num2) {
        int hcf = hcf(num1, num2);
        return (num1 * num2) / hcf;
    }
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int firstNumerator = sc.nextInt();
        int firstDenomenator = sc.nextInt();
        int secondNumerator = sc.nextInt();
        int secondDenomenator = sc.nextInt();

        String result = addFractions(firstNumerator, firstDenomenator, secondNumerator, secondDenomenator);
        System.out.println("Sum of " + firstNumerator + "/" + firstDenomenator + " + " + secondNumerator + "/" + secondDenomenator + " = " + result);


        sc.close();

    }

    /*      Approach 
     *    1) Take LCM of the denomenators and find newDenomenator
     *    2) Modify the numerators of the fractions based on the newDenomenator
     *    3) Sum up all the numerators
     *    4) Now Simplify the sumNumerator and newDenomenator by finding the hcf 
     */
}