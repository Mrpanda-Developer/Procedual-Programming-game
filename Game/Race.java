package Game;
import java.util.Scanner;
/*
 * This is the race mini-game class.
 * The player must type prompts quickly and accurately to win
 * @param scanner The Scanner object for user input.
 * 
 */
public class Race {
    public static void startRace(Scanner scanner) {
        String[] prompts = {
            "Steel Ball Run",
            "Gyro Zeppeli",
            "Golden Spin",
            "Johnny Joestar",
            "Tusk Act 4"
        };

        int player = 0; //  player score
        int enemy = 0; // rival score
        int finish = 5; // Steps to win

        System.out.println("\nThe Steel Ball Run race begins!");
        System.out.println("Type the prompts as fast and correct as you can!\n");

        for (String prompt : prompts) {
            System.out.println("Prompt: " + prompt);

            long startTime = System.currentTimeMillis();
            String input = scanner.nextLine();
            long endTime = System.currentTimeMillis();

            // check input
            if (input.equals(prompt)) {
                long timeTaken = endTime - startTime;
                if (timeTaken < 4000) { // faster than 4 seconds
                    player++;
                    System.out.println("You gallop forward! (Step " + player + ")");
                } else {
                    System.out.println("Too slow... your rival advances!");
                    enemy++;
                }
            } else {
                System.out.println("Wrong input! Your rival gains ground!");
                enemy++;
            }

            // check winconditie
            if (player >= finish) {
                System.out.println("\n🏆 You crossed the finish line first! Victory!");
                return;
            } else if (enemy >= finish) {
                System.out.println("\n💀 Your rival outran you... You lost the Steel Ball Run.");
                return;
            }
        }

        // fallback if no one reached finish
        if (player > enemy) {
            System.out.println("\n🏆 You barely win the race!");
        } else if (enemy > player) {
            System.out.println("\n💀 Your rival barely outran you...");
        } else {
            System.out.println("\n🤝 It's a tie! The race continues another day...");
        }
    }
}
