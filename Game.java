import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Intro.show();

        Scanner scanner = new Scanner(System.in);

        String name = InputNameAge.getName(scanner);
        int age = InputNameAge.getAge(scanner);

        System.out.println("Hello, " + name + "! You are " + age + " years old.");
        
        int stateId = 0;
        printStage.show(stateId);

        while (true) {
            String action = getInput.getUserInput(scanner);
            stateId = takeAction.Visitor(action, stateId);

            if (stateId == 666) {
                System.out.println("You left the Steel Ball Run... Thanks for playing!");
                break;
            }

            printStage.show(stateId);
        }

        scanner.close(); 
    }
}
