package Strings;
// Toggle characters in String
import java.util.Scanner;

public class Question110 {

    // Time Complexity - O(n), Space Complexity - O(n)
    public static String toggle(String str) {

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch)) {
                ch = Character.toUpperCase(ch);
                sb.append(ch);
            }
            else {
                ch = Character.toLowerCase(ch);
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = toggle(str);
        System.out.println("Toggled String = " + str);
        sc.close();
    }
}
