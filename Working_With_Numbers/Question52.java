import java.util.Scanner;

// Count the occurances of a Digit in a number

public class Question52 {

    // Approach - 1 By Using While Loop
    public static long countOccurances(long num, long digit) {

        if(num == 0) {
            return digit == 0 ? 1 : 0;
        }
        
        long count = 0;
        num = Math.abs(num);

        while(num > 0) {
            long rem = num % 10;
            if(rem == digit)
                count++;
            num /= 10;
        }

        return count;
    }

    // Approach 2 
    public static long countOccurancesApproach2(long num, long digit) {

        long count = 0;
        String str = String.valueOf(num);
        char arr[] = str.toCharArray();

        for(int i = 0; i < arr.length; i++) {
            if((arr[i] - '0') == digit) {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        long digit = sc.nextLong();

        // System.out.println(countOccurances(number, digit));
        System.out.println(countOccurancesApproach2(number, digit));

        sc.close();

    }

    /*
     *  Different Ways to convert character to it's corresponding numerical value
     *      1) Character.getNumbericValue()
     *      2) substract character '0' from the character 
     *      3) Integer.parseInt()
     *      4) Character.digit(char, radix) -> radix is the base, The number should be in which base
     */
}