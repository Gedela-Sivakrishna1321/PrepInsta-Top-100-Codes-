import java.util.Scanner;

// Count the number of Digits

public class Question49 {

    public static int countDigits(long num) {

        int count = 0;

        while(num != 0) {
            count++;
            num /= 10;
        }

        return count;
    }

    public static int formulaApproach(long num) {
        return (int)(Math.log10(num)) + 1;
    }

    public static int stringApproach(long num) {
        return String.valueOf(num).length();
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        System.out.println("Length by Approach 1 = " + countDigits(num));
        System.out.println("Length by Approach 2 = " + formulaApproach(num));
        System.out.println("Length by Approach 3 = " + stringApproach(num));


        sc.close();
    }


}

