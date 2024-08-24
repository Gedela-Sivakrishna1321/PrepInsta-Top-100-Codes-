package Arrays;
// Check If Parenthesis is balanced
import java.util.Scanner;
import java.util.Stack;

public class Question105 {
    
    // Time Complexity - O(n), Space Complexity - O(1)
    public static boolean isBalanced(String str) {

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if( (ch == '(' || ch == '{' || ch == '[')) {
                stack.push(ch);
            }
            else {
                if(stack.isEmpty()) {
                    return false;
                }

                if((stack.peek() == '(' && ch == ')') 
                  || (stack.peek() == '{' && ch == '}')
                  || (stack.peek() == '[' && ch == ']')) {
                    stack.pop();
                  }
                  else {
                    return false;
                  }
            }

        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(isBalanced(str));
        sc.close();
    }
}
