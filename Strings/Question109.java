package Strings;
// Length of String without using String.length() function
import java.util.Scanner;

public class Question109 {

    // Time complexity - O(n), Space Complexity - O(1)
    public static int length(String str) {
        int count = 0;

        while(str != "") {
            count++;
            str = str.substring(1);
        }
        return count;
    }

    // Time Complexity - O(n)
    public static int recLength(String str) {
        // Base case
        if(str == "") {
            return 0;
        }
        return 1 + recLength(str.substring(1));
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // System.out.println(length(str));
        System.out.println( "Length = "+recLength(str));

        sc.close();
    }
}
