package Strings;
// Capitalize the first and last character of each word in a string
import java.util.Scanner;

public class Question119 {

    // Time Complexity - O(n), Space Complexity - O(n)
    public static String capitalize(String str) {
        // int n = str.length();
        StringBuilder sb = new StringBuilder();

        for(String s : str.split("\\s")) {
            int len = s.length();
            char first = Character.toUpperCase(s.charAt(0));
            char last = Character.toUpperCase(s.charAt(len-1));
            s = first + s.substring(1, len-1) + last + " ";
            sb.append(s);
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(capitalize(str));
        sc.close();
    }
}
