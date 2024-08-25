package Strings;
// Check whether the entered character is Alphabet / not
import java.util.Scanner;

public class Question107 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 123)) {
            System.out.println("Alphabet");
            sc.close();
            return;
        }

        System.out.println("Invalid input");
        sc.close();
    }
}
