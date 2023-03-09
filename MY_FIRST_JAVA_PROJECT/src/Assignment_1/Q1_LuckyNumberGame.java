package Assignment_1;
import java.util.Scanner;

public class Q1_LuckyNumberGame {

    public static void main(String[] args) {

        // get number of rounds from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rounds: ");
        int numRounds = scanner.nextInt();

        int secretNumber = 7 ; // arbitrary secret number

        int totalScore = 0; // initialize score to zero

        for (int x = 1; x <= numRounds; x++) {
            System.out.print("Enter lucky number for round " + x + ": ");
            int hailMary_Num = scanner.nextInt();

            int remnant = hailMary_Num % secretNumber;

            if (remnant == 0) {
                System.out.println("Draw for round " + x);
                totalScore++;
            } else if (remnant % 2 == 0) {
                System.out.println("Win for round " + x);
                totalScore += 3;
            } else {
                System.out.println("Loss for round " + x);
                totalScore -= 3;
            }
        }

        // check if player wins
        if (totalScore > 0) {
            System.out.println("Congratulations, you win! Total score: " + totalScore);
        } else {
            System.out.println("Sorry, you lose. Total score: " + totalScore);
        }

        // close scanner
        scanner.close();
    }

}
