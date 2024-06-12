// package Working_With_Numbers;
import java.util.Scanner;

// Convert Binary Number to Octal Number

public class Question38 {

    public static int octalOf(String binNum) {

        int len = binNum.length();
        int rem = len % 3 ;
        int numberOfZeros = 3 - rem;

        while(numberOfZeros-- > 0) {
            binNum = "0" + binNum;
        }

        // String array[] = {"000", "001", "010", "011", "100", "101", "110", "111"};
        StringBuilder result = new StringBuilder();
        int count = 0;
        String temp = "";

        for(int i = 0; i < binNum.length(); i++) {
            count++;

            char ch = binNum.charAt(i);
            temp += ch;

            if(count == 3) {
                int val = binarEquvivalent(temp);
                result.append(val);
                temp = "";
                count = 0;
            }
        }


        if(result.charAt(0) == '0') {
            return Integer.valueOf(result.toString().substring(1));
        }

        return Integer.valueOf(result.toString());
    }

    public static int binarEquvivalent(String str) {

        switch (str) {
            case "000":
                return 0;
            case "001" : 
                return 1;
            case "010":
                return 2;
            case "011":
                return 3;
            case "100":
                return 4;
            case "101":
                return 5;
            case "110":
                return 6;
            default:
                return 7;
        }
    }

    public static int approach2(String binNum) {

        int decimal = decimalOf(binNum);

        String octalString = Integer.toOctalString(decimal);

        int octalNum = Integer.parseInt(octalString);

        return octalNum;
    }

    public static int decimalOf(String binNum) {

        int a = 1;
        int result = 0;
        for(int i = binNum.length()-1; i >= 0; i--) {
            char ch = binNum.charAt(i);

            if(ch == '1') {
                result += a;
            }

            a *= 2;

        }

        return result;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String binNum = sc.next();

        // System.out.println("Octal Value = " + octalOf(binNum));
        // System.out.println("Decimal NUmber of " + decimalOf(binNum));
        System.out.println("Octal Number = " + approach2(binNum));

        sc.close();
    }

    /*   Approach 2 is easy : 
     *  1) Convert the binary number to decimal number first
     *  2) Then use the in-built method to convert decimal to Octal Value
     */
    
}
