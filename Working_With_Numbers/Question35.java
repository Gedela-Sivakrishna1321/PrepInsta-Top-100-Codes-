// package Working_With_Numbers;
import java.util.Scanner;
// Convert Decimal Number to Binary Number - 12  ==> 1100
     //                                       (10)      (2)

/*      Approach :- 
 *          1) Loop till num >= 2
 *          2) Find out the reminder when dividing number by 2
 *          3) Add the remainder to the result
 *          4) Update the number i.e num = num / 2
 */

public class Question35 {

    public static String binaryNum(int num) {

        StringBuilder result = new StringBuilder();

        while(num != 0) {
            int remainder = num % 2;
            result.append(remainder);
            num = num / 2;
        }

        return result.reverse().toString();
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int decNum = sc.nextInt();

        System.out.println("Binary represented number = " + binaryNum(decNum));

        sc.close();
    }
}