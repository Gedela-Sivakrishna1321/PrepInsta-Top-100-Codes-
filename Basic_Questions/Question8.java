package Basic_Questions;
import java.util.Scanner;

// Program to Check Leap Year or not

public class Question8 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        /*      Leap Year Conditions 
         *    1) For Century years, It should be divisible by both 100 & 400
         *    2) For rest, It should be divisible  by 4
         */
        boolean result = false;
        if((year % 100 == 0 && year % 400 == 0) || (year % 4 == 0) )
            result = true;
        
            if(result)
                System.out.println("Leap Year");
            else    
                System.out.println("Not a Leap Year");

        
        sc.close();

    }
}