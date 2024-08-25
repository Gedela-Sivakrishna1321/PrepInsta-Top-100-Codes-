package Strings;
// Check if the entered character is vowel / constant
import java.util.Scanner;

public class Question106 {

    public static boolean isVowel(char ch) {

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
                return true;
            default :
                return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if(!((ch >= 65 && ch <= 90 ) || (ch >= 97 && ch <= 122))) {
            System.out.println("Invalid input ");
            sc.close();
            return;
        }

        System.out.println((isVowel(ch) ? "Vowel" : "Constant"));
        sc.close();
    }
}