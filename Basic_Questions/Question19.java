package Basic_Questions;
import java.util.Scanner;

// Power of a Number

public class Question19 {

    // Linear Time Complexity
    public static void iterativeApproach(int base, int power) {

        int ans = 1;
        System.out.print(base + "^" + power + " is : ");
        while(power-- > 0) {
            ans = ans * base;
        }
        System.out.println(ans);
    }

    // Linear Time Complexity
    public static int recursiveApproach(int base, int power ) {
        // Base case
        if(power == 0)
            return 1;
        
        return base * recursiveApproach(base, power-1);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int power = sc.nextInt();

        iterativeApproach(base, power);
        System.out.print(base + "^" + power + " is : "+ recursiveApproach(base, power));
        System.out.print(base + "^" + power + " is : "+ Math.pow(base, power));

        sc.close();

    }
    
}
