package Working_With_Numbers;
import java.util.Scanner;
// Convert Octal To Binary

public class Question39 {
    
    public static String binEquivalent(int num) {
        switch (num) {
            case 1:
                return "001";
            case 2 :
                return "010";
            case 3 : 
                return "011";
            case 4 : 
                return "100";
            case 5 : 
                return "101";
            case 6 : 
                return "110";
            case 7 : 
                return "111";
            default:
                return "000";
        }
    }

    public static String binaryOf(int octalNum) {

        String result = "";

        while(octalNum != 0) {
            int lastDigit = octalNum % 10;
            System.out.println("Last Digit = " + lastDigit);
            result = binEquivalent(lastDigit) + result;
            octalNum /= 10;
        }

        return result;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int octalNum = sc.nextInt();
        System.out.println("Binary Equvivalent = " + binaryOf(octalNum));

        sc.close();

    }
}
