import java.util.Scanner;
// Find the Maximum Handshakes Possible

public class Question42 {
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int no_of_people = sc.nextInt();

        System.out.println("Maximum number of handshakes possible = " + ((no_of_people+1)*no_of_people)/2);

        sc.close();
    }

    /*       Approach :- 
     *      1) Total there are N persons in the room
     *      2) For 1st person, N-1 people are there to shake hands
     *      3) For 2nd person, N-2 people are there to shake hands because he already shaked hand with 1st person
     *      4) For 3rd person, N-3 people are there because he already shaked hand with first two people
     *      5) So finally the total no of handshakes possible = N-1 + N-2 + N-3 + N-4 + ..... 1 
     *          which is n * (n+1)/2
     */
}
