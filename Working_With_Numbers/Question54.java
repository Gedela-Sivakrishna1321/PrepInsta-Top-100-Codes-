import java.util.Scanner;

// Find the roots of the Quadratic Equation

public class Question54 {

    public static void rootsOfQuadraticEquation(int a, int b, int c) {

        // Find determinent
        int determinent = b*b - 4*a*c;
        
        if(determinent == 0) {
            System.out.println("Roots are real and equal");
            double root = -b / (2 * a);
            System.out.println("Root 1 - " + root + ", Root 2 - " + root);
        }
        else if (determinent > 0) {
            System.out.println("Roots are real and distinct");
            double root1 = (-b + Math.sqrt(determinent) ) / (2*a);
            double root2 = (-b - Math.sqrt(determinent)) / (2*a);
            System.out.println("Root 1 - " + root1 + ", Root 2 - " + root2);
        }
        else {
            System.out.println("Roots are imaginary ");
            double real = -b / (2*a);
            double imaginary = Math.sqrt(determinent) / (2 * a);
            System.out.println("Root 1 - " + real + " + " + imaginary + "i " + "Root 2 - " + real + " - " + imaginary + "i ");

        }

    }
    

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        rootsOfQuadraticEquation(a, b, c);

        sc.close();
    }
}
