package Game;

import java.util.Scanner;
/* this will handle the intro scene 
 * 
 * @param scanner Scanner 
*/
public class Scene {

    public static void showIntroScene(Scanner scanner) {
        System.out.println("\nYou are standing at the starting line of the Steel Ball Run.");
        System.out.println("Riders from all over the world gather, their horses restless,");
        System.out.println("while the desert wind carries whispers of glory and danger.");
        System.out.println("Somewhere among them are mysterious figures: Gyro Zeppeli,");
        System.out.println("with his strange Steel Balls, and Johnny Joestar,");
        System.out.println("a fallen jockey with eyes that burn with determination.");
        System.out.println("The crowd cheers, the gunsmoke rises into the sky...");
        System.out.println("This is more than a race. It is fate in motion.");
        
        System.out.print("\nWhat will you do? (Mount horse / Talk to rider / Wait for signal): ");
        String action = scanner.nextLine();

        System.out.println("\nYou chose to: " + action);
        System.out.println("The adventure of Steel Ball Run has begun...");
    }
}
