package Strings;
// Count the frequency of characters in a String
import java.util.Scanner;
import java.util.LinkedHashMap;

public class Question120 {

    public static void countChars(String str) {
        
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for(char ch : str.toCharArray()) {
            ch = Character.toLowerCase(ch);    
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println(map);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        countChars(str);

        sc.close();
    }
}
