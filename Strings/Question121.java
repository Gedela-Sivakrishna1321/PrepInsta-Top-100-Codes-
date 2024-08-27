package Strings;
// Find the first Non repeating character in a string
import java.util.Scanner;
import java.util.LinkedHashMap;

public class Question121 {

    // Time Complexity - O(n^2) in worst case, Space Complexity- O(1)
    public static char nonRepeatingChar(String str) {
        int n = str.length();
        for(int i = 0; i < n - 1; i++) {
            char ch = str.charAt(i);
            boolean flag = false;
            for(int j = i + 1; j < n; j++) {
                if(str.charAt(j) == ch) {
                    flag = true;
                    break;
                }
            }
            if(!flag)
                return ch;
        }
        return '0';
    }

    // Time Complexity - O(n), Space Complexity - O(n)
    public static char mapApproach(String str) {

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for(char ch : str.toCharArray())
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        
        for(char key : map.keySet()) {
            if(map.get(key) == 1)
                return key;
        }
        return '$';
    }

    // Time Complexity - O(n), Space Complexity - O(1)
    public static char efficientApproach(String str) {
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(str.indexOf(ch) == str.lastIndexOf(ch)) {
                return ch;
            }
        }
        return '$';
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // System.out.println( mapApproach(str));
        // System.out.println(nonRepeatingChar(str));
        System.out.println(efficientApproach(str));
        sc.close();
    }
}
