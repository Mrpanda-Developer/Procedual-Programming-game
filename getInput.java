import java.util.Scanner;
/*
 * This will handle the user input and validate it
 * to ensure it matches one of the predefined actions.
 * @param scanner Scanner 
 */
public class getInput {
      public static String getUserInput(Scanner scanner) {
        System.out.print("What would you like to do?: ");
        String input = scanner.nextLine();

        String normalized = input.trim().toLowerCase();

        String[] validActions = {
            "open the door", "go north", "go east", "go south",
            "go west", "take item", "drop item", "use item"
        };

        for (String action : validActions) {
            if (normalized.equals(action)) {
                System.out.println(input);
                return normalized;
            }
        }

        System.out.println("Invalid input");
        System.exit(0);
        return "";
    }
}
