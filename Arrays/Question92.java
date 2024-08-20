package Arrays;
// Find the symmetric Elements in the array
import java.util.Scanner;
import java.util.HashMap;

public class Question92 {

    // Time Complexity - O(n^2), Space Complexity - O(1)
    public static void printSymmetricPairs(int matrix[][]) {
        int a,b,c,d;
        for(int i = 0; i < matrix.length; i++) {
            a = matrix[i][0];
            b = matrix[i][1];
            for(int j = i + 1; j < matrix.length; j++) {
                c = matrix[j][0];
                d = matrix[j][1];
                if(a == d && b == c) {
                    System.out.print("( " + a + ", " + b + " )" + ", ");
                }
            }
        }
        System.out.println();
    }

    // Time Complexity - O(n), Space Complexity - O(n)
    public static void printSymmetricPairsEfficentApproach(int matrix[][]) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < matrix.length; i++) {

            int first = matrix[i][0];
            int sec = matrix[i][1];

            Integer val = map.get(sec);

            if(val != null && val == first) { // here print sec first bcz initially elements not prsent in map
                System.out.print("( " + sec + ", " + first + " )" + " "); // we find the later pair so print reverse
            }
            else {
                // Insert the pair to the map
                map.put(first, sec);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int matrix[][] = new int[n][2];

        for(int i = 0; i < n; i++) {
            matrix[i][0] = sc.nextInt();
            matrix[i][1] = sc.nextInt();
        }
        // printSymmetricPairs(matrix);
        printSymmetricPairsEfficentApproach(matrix);
        sc.close();
    }
    
}
