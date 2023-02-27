import java.util.Scanner;

public class Q1_LuckyNumberGame {

    public static void main(String[] args) {

        // get number of rounds from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rounds: ");
        int numRounds = scanner.nextInt();

        int secretNumber = 7; // arbitrary secret number

        int totalScore = 0; // initialize score to zero

        for (int i = 1; i <= numRounds; i++) {
            System.out.print("Enter lucky number for round " + i + ": ");
            int luckyNumber = scanner.nextInt();

            int remainder = luckyNumber % secretNumber;

            if (remainder == 0) {
                System.out.println("Draw for round " + i);
                totalScore++;
            } else if (remainder % 2 == 0) {
                System.out.println("Win for round " + i);
                totalScore += 3;
            } else {
                System.out.println("Loss for round " + i);
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
