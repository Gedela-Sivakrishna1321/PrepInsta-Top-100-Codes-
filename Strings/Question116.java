package Strings;
// Remove Spaces from a string
import java.util.Scanner;

public class Question116 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replaceAll(" ", "");
        System.out.println(str);
        sc.close();
    }
}