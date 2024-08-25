package Strings;
// Count the number of vowels in a String
import java.util.Scanner;

public class Question111 {

    // Time Complexity - O(n), Space Complexity - O(1)
    public static int countVowels(String str) {
        int count = 0;

        for(char ch :  str.toCharArray()) {
            switch(ch) {
                case 'a' :
                case 'A' :
                case 'e' :
                case 'E' :
                case 'i' :
                case 'I' :
                case 'o' :
                case 'O' :
                case 'u' :
                case 'U' :
                    count++;
                    break;
                default : 
                    continue;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println("Vowel Count = " + countVowels(str));
        sc.close();
    }
}
