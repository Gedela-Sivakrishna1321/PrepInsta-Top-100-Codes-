import java.util.Scanner;

// Convert Number to Word

public class Question50 {

    public static String convertNumberToWord(int num) {

        StringBuilder result = new StringBuilder();
        String singleDigits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", 
                "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"            
            };

        String tenDigits[] = {"", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        if(num >= 0 && num <= 19) {
            return singleDigits[num];
        }
        else if (num >= 20 && num <= 99) {
            if(num % 10 == 0) {
                return tenDigits[num/10];
            }
            else {
                result.append(tenDigits[num/10]);
                result.append(" ");
                result.append(singleDigits[num%10]);
            }
            return result.toString();
        }

        else if(num >= 100 && num <= 999) {
            int ones_digit = num % 10;
            num /= 10;
            int tens_digit = num % 10;
            int hundreds_digit = num / 10;
            if(tens_digit == 0 && ones_digit == 0) {
                return singleDigits[hundreds_digit] + " hundred ";
            }
            else if (ones_digit == 0) {
                return singleDigits[hundreds_digit] + " " + tenDigits[tens_digit];
            }
            else {
                return singleDigits[hundreds_digit] + " hundred " + tenDigits[tens_digit] + " " + singleDigits[ones_digit];
            }
        }

        return "invalid !";

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(convertNumberToWord(num));


        sc.close();

    }
}