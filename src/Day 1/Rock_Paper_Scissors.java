import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        String[] choices = {"rock", "paper", "scissors"};
        Random r = new Random();
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your choice (rock, paper, scissors):");
        String playerChoice = s.nextLine();

        String computerChoice = choices[r.nextInt(choices.length)];
        System.out.println("Computer chose " + computerChoice);

        if (playerChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if (playerChoice.equals("rock") && computerChoice.equals("scissors") ||
                playerChoice.equals("paper") && computerChoice.equals("rock") ||
                playerChoice.equals("scissors") && computerChoice.equals("paper")) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
    }
}
