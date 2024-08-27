package Strings;
// Count the sum of the Digits in a String
import java.util.Scanner;

public class Question118 {

    public static int countDigitSum(String str) {

        int sum = 0;
        for(char ch : str.toCharArray()) {
            if(Character.isDigit(ch)) 
                sum += Character.getNumericValue(ch);
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(countDigitSum(str));
        sc.close();
    }
}
