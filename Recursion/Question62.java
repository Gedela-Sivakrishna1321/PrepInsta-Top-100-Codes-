package Recursion;
import java.util.Scanner;

// Calculate the Length of String without using length function

public class Question62 {

    public static long calcLen(String str) {
        // Base case
        if(str == "") {
            return 0;
        }

        return 1 + calcLen(str.substring(1));
    }

    public static long loopApproach(String str) {
        long count = 0;

        while(str != "") {
            count++;
            str = str.substring(1);
        }

        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        // System.out.println("Length = " + calcLen(str));
        System.out.println("Length = " + loopApproach(str));




        sc.close();

    }

}