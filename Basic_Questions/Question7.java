package Basic_Questions;
import java.util.Scanner;

// Greatest Number Among Three Numbers

public class Question7 {
    
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        // Approach 1 - If else
        int max = 0;
        if((num1 > num2) && (num1 > num3)) {
            max =  num1;
        }
        else if ((num2 > num1) && (num2 > num3)) {
            max = num2;
        }
        else {
            max = num3;
        }

        System.out.println("Greatest among " + num1 + ", "+num2 + ", "+num3+" is : " + max);

        // Approach 2 - Terenary operator
        max = (num1 > num2 && num1 > num3) ? num1 : ((num2 > num1 && num2 > num3) ? num2 : num3);
        System.out.println("Greatest among " + num1 + ", "+num2 + ", "+num3+" is : " + max);

        // Approach 3 - In Built Function
        max = Math.max(num1, Math.max(num2, num3));
        System.out.println("Greatest among " + num1 + ", "+num2 + ", "+num3+" is : " + max);

        sc.close();
    }
}
