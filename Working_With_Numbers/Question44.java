//
import java.util.Scanner;

// Replace all 0's in an Integer with 1's

public class Question44 {
    
    public static int replaceZeros(int num) {

        StringBuilder sb = new StringBuilder(String.valueOf(num));

        for(int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if(ch == '0') {
                sb.replace(i, i+1, "1");
            }
        }

        int result = Integer.parseInt(sb.toString());
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result =  replaceZeros(num);
        System.out.println("Number After replacing all zeros = " + result );

        sc.close();
    }

    /*      Approach 
     *  1) Convert the number to string and loop through it
     *  2) If current character is '0' then replace it with '1'
     */

}
