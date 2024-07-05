import java.util.Scanner;

// Find the roots of the Quadratic Equation

public class Question54 {

    public static void rootsOfQuadraticEquation(int a, int b, int c) {

        // Find determinent
        int determinent = b*b - 4*a*c;
        System.out.println("Determinent Value = " + determinent);
        
        double D = Math.sqrt(Math.abs(determinent));
        // double r = 2 * a;
        System.out.println("Sqrt Value = " + D);
        if(determinent == 0) {
            System.out.println("Roots are real and equal");
            double root = -(double)b / (2 * a);
            System.out.println("Root 1 = " + root + "\n" + "Root 2 = " + root);
        }
        else if (determinent > 0) {
            System.out.println("Roots are real and distinct");
            double root1 = (-(double)b + D ) / (2*a);
            double root2 = (-(double)b - D) / (2*a);
            System.out.println("Root 1 = " + String.format("%.2f", root1) + "\n" + "Root 2 = " + String.format("%.2f", root2));
        }
        else {
            System.out.println("Roots are imaginary ");
            System.out.println("Real Value Part = " + -b / (2*a));
            double real = -(double)b / (2*a);
            // double imaginary = D / (2 * a);
            // System.out.println("Root 1 = " + real + " + " + String.format("%.2f", D)+ " i" );
            // System.out.println("Root 2 = " + real + " - " + String.format("%.2f", D)+ " i" );
            System.out.printf("Root 1 = %.2f + %.2f i %n", real, D);
            System.out.printf("Root 2 = %.2f - %.2f i %n", real, D);

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
