import java.util.Scanner;
// Find the Permutation

public class Question41 {

    public static int factorial(int num) {
        // Base case
        if(num == 1) {
            return 1;
        }

        return num * factorial(num - 1);
    }

    public static int permutation(int n, int r) {

        int result = factorial(n) / factorial(n - r);

        return result;
    }
    
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int seats = sc.nextInt();
        int students = sc.nextInt();


        System.out.println(permutation(seats, students));

        sc.close();

    }
}
