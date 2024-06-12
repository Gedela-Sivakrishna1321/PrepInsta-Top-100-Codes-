// package Working_With_Numbers;
import java.util.Scanner;

public class Question37 {

    public static String hexaDecimalOf(int num) {

        StringBuilder result = new StringBuilder();
        String str = "0123456789ABCDEF";

        while(num > 0) {
            int digit = num % 16;
            result.append(str.charAt(digit));
            num /= 16;
        }

        return result.reverse().toString();

    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int decNum = sc.nextInt();

        System.out.println(hexaDecimalOf(decNum));

        sc.close();

    }
}