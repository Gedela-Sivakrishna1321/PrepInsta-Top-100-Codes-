import java.util.Scanner;

// Calculate the Area of a circle

public class Question47 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();

        float pie = (float)3.14;

        double area = (float)(pie * Math.pow(radius, 2));

        System.out.println("Area of circle = " + area);

        sc.close();

    }
}