package Game;
import java.util.Scanner;
/*
 * This class will handle the player's actions based on their input and the current game state.
 * It will return the new game state after processing the action.
 * @param action The action input by the player.
 * @param currentState The current state of the game.
 * @param scanner The Scanner object for user input.
 */

public class takeAction {
    public static int Visitor(String action, int currentState, Scanner scanner) {
        // --- STATE 0: Start ---
        if (currentState == 0 && action.equals("open the door")) {
            System.out.println("You step through the starting gates of the Steel Ball Run!");
            return 1; // to hallway
        } else if (currentState == 0 && action.equals("take item")) {
            System.out.println("You pick up Gyro's Steel Ball. It hums with strange energy...");
            return 2; // steel ball state
        }

        // --- STATE 1: Hal ---
        else if (currentState == 1 && action.equals("go east")) {
            System.out.println("You ride further east into the desert...");
            return 3; // Diego encounter
        } else if (currentState == 1 && action.equals("go north")) {
            System.out.println("You gallop into a side race track!");
            Race.startRace(scanner);
            return 1; // tback to hallway
        }

        // --- STATE 2: Steel Ball ---
        else if (currentState == 2 && action.equals("use item")) {
            System.out.println("The Steel Ball spins in your hand... A strange force awakens!");
            BossFight.startFight(scanner);
            return 0; // back to start
        } else if (currentState == 2 && action.equals("drop item")) {
            System.out.println("You drop the Steel Ball. It rolls away into the sand...");
            return 0; // back to the start no item
        }

        // --- STATE 3: Diego encounter ---
        else if (currentState == 3 && action.equals("use item")) {
            System.out.println("You unleash the Steel Ball against Diego Brando!");
            BossFight.startFight(scanner);
            return 0; // back to start
        } else if (currentState == 3 && action.equals("go west")) {
            System.out.println("You retreat back to the hallway...");
            return 1;
        }

        // --- QUIT ---
        else if (action.equals("quit")) {
            return 666; // quit state
        }

        // --- DEFAULT ---
        else {
            System.out.println("Nothing happens... the race continues.");
            return currentState;
        }
    }
}
