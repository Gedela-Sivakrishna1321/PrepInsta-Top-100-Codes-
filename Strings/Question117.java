package Strings;
// Remove Brackets from an Algebric Expression
import java.util.Scanner;

public class Question117 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.replaceAll("[{}\\[(\\])]", "");
        System.out.println(str);
        sc.close();
    }
}
