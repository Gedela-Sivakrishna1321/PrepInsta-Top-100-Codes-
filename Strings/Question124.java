package Strings;
// Replace the word in the String
import java.util.Scanner;

public class Question124 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String word = sc.next();
        str = str.replaceAll(word, "");
        System.out.println(str);
        sc.close();
    }
}