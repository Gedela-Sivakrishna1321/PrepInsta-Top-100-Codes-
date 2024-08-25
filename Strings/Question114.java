package Strings;
// Reverse a String
import java.util.Scanner;

public class Question114 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = new StringBuilder(str).reverse().toString();
        System.out.println(str);
        sc.close();
    }
}
