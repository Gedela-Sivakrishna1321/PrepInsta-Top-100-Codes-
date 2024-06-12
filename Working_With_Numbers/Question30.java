// package Working_With_Numbers;
import java.util.Scanner;
// LCM Of Two Numbers - The minimum number which is divisible by both the numbers

public class Question30 {

    public static int naiveApproach(int num1, int num2) {

        int max = Math.max(num1, num2);

        for(int i = max; i <= num1 * num2; i++) {
            if(i % num1 == 0 && i % num2 == 0) {
                return i;
            }
        }

        return -1;
    }
    
    public static int naiveOptmised(int num1, int num2) {

        int max = Math.max(num1, num2);

        for(int i = 1; i <= num1 * num2; i += max) {
            if(i % num1 == 0 && i % num2 == 0) {
                return i;
            }
        }

        return -1;
    }

    public static int hcfApproach(int num1, int num2) {
        int temp1 = num1, temp2 = num2;
        while(num1 != num2) {

            if(num1 > num2) {
                num1 = num1 - num2;
            }
            else {
                num2 = num2 - num1;
            }
        }

        int hcf = num1;

        int lcm = (temp1 * temp2) / hcf;

        return lcm;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("LCM Is : "+hcfApproach(num1, num2));

        sc.close();
    }
}
