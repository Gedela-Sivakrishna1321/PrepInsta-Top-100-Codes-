package Strings;
// Replace a substring 
import java.util.Scanner;

public class Question123 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String replace = sc.next();
        String newSub = sc.next();
        str = str.replaceAll(replace, newSub);
        System.out.println(str);

        sc.close();
    }
}
