import java.util.Scanner;

// Program to Return the number of days in any given month of the year

public class Question51 {

    // Switch Case
    public static void switchCaseApproach(int month, int year) {

        switch(month) {
            case 1 : 
            case 3 : 
            case 5 :
            case 7 :
            case 8 : 
            case 10 :
            case 12 :
                System.out.println("N.o of Days : " + 31);
                break;
            case 4 :
            case 6 : 
            case 9 :
            case 11 :
                System.out.println("N.o of Days : " + 30);
                break;
             case 2 :
                int days = 28;
                if((year % 4 == 0 && year % 100 != 0 ) || (year % 100 == 0 && year % 400 == 0) ) {
                    days = 29;
                } 
                System.out.println("N.o of Days : " + days);
                break;
            default : 
                System.out.println("Invalid month !");
        }
    }

    // If else Ladder

    // Array

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();

        switchCaseApproach(month, year);


        sc.close();

    }
    
}
