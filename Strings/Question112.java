package Strings;
// Remove Vowels from String
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Question112 {

    // Time Complexity - O(n), Space Complexity - O(n) // because using stringbuilder to store the new string
    public static String removeVowels(String str) {
        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray()) {
            if(!list.contains(ch)) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // str = removeVowels(str);
        str = str.replaceAll("[aeiouAEIOU]", ""); // easy approach
        System.out.println("String Without Vowels = " + str);
        sc.close();
    }
}
