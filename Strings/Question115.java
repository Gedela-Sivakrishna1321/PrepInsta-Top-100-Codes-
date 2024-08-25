package Strings;
// Remove all characters except Alphabets 
import java.util.Scanner;

public class Question115 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray()) {
            if(Character.isAlphabetic(ch)) {
                sb.append(ch);
            }
        }
        System.out.println(sb);
        sc.close();
    }
}
