// package Working_With_Numbers;
import java.util.Scanner;
// HexaDecimal to Decimal Conversion

public class Question34 {

    public static int hexaDecimalToDecimal(String num) {
        int a = 1;
        String str = "0123456789ABCDEF";
        int result = 0;

        for(int i = num.length() - 1; i >= 0; i--) {
            char ch = num.charAt(i);
            int digit = str.indexOf(ch);
            result += digit * a;
            a *= 16;
        }

        return result;

    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();

        System.out.println(hexaDecimalToDecimal(num));

        sc.close();
    }
}
