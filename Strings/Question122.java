package Strings;
// Check if two strings are anagrams 
import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;

public class Question122 {

    // Time Complexity - O(n), Space Complexity - O(n)
    public static boolean anagrams(String str1, String str2) {

        if(str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(char ch : str1.toCharArray())
            map1.put(ch, map1.getOrDefault(ch, 0)+1);
    
        for(char ch : str2.toCharArray())
            map2.put(ch, map2.getOrDefault(ch, 0)+1);
        
        for(char key : map1.keySet()) {
            if((!map2.containsKey(key)) || !(map1.get(key).equals(map2.get(key)))) 
                return false;
        }
        
        return true;
    }

    // Time Complexity - O(n logn), Space Complexity - O(n)
    public static boolean arrayApproach(String str1, String str2) {
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(anagrams(str1, str2));

        sc.close();
    }
}
