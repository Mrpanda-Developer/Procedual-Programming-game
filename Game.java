import java.util.Scanner;
/*
 * This will be the main game loop.
 * Here we will initialize the game, get user input, and call other classes/methods as needed.
 * This is also where our scanner object will be created and closed.(And passed to other classes as needed)
 */
public class Game {
    public static void main(String[] args) {
        Intro.show();

        Scanner scanner = new Scanner(System.in);

        String name = InputNameAge.getName(scanner);
        int age = InputNameAge.getAge(scanner);

        System.out.println("Hello, " + name + "! You are " + age + " years old.");
        
        int stateId = 0;
        PrintStage.show(stateId);

        while (true) {
            String action = getInput.getUserInput(scanner);
            stateId = takeAction.Visitor(action, stateId, scanner);

            if (stateId == 666) {
                System.out.println("You left the Steel Ball Run... Thanks for playing!");
                break;
            }

            PrintStage.show(stateId);
        }

        scanner.close(); 
    }
}
