// package Working_With_Numbers;
import java.math.BigInteger;
import java.util.Scanner;

// Convert Decimal to Octal - 12     ==> 14
//                              (10)      (8)

/*      Approach :- 
 *          1) Approach is same as Decimal to Binary Convertion, just divide by 8
 */

public class Question36 {

    public static String octalNum(BigInteger num) {

        StringBuilder result = new StringBuilder();
        
        while(num.compareTo(BigInteger.ZERO) > 0) {
            BigInteger remainder = num.mod(BigInteger.valueOf(8));
            result.append(remainder);
            num.divide(BigInteger.valueOf(8));
        }

        return result.reverse().toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        BigInteger decNum = sc.nextBigInteger();

        // System.out.println(!decNum.equals(0));
        
        String octalString = decNum.toString(8);
        System.out.println("Octal Represented : " + octalString);
        
        sc.close();
    }
    
}
