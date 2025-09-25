/*
 * This class will handle printing the narrative text for each stage of the game.
 * It will display different messages based on the current state of the game.
 * @param stateId The current state of the game.
 */

public class PrintStage {
    public static void show(int stateId) {
        switch (stateId) {
            case 0:
                System.out.println("You are standing at the starting line of the Steel Ball Run.");
                System.out.println("Riders from across the world gather, horses restless.");
                System.out.println("Gyro Zeppeli spins his Steel Balls in the distance, while Johnny Joestar stares ahead.");
                System.out.println("The desert wind carries whispers of glory...");
                break;
            case 1:
                System.out.println("You gallop forward into the chaos. Sand and dust blind your eyes.");
                System.out.println("A rider with a scar laughs as he overtakes you.");
                System.out.println("The gunshot echoes: the Steel Ball Run has truly begun!");
                break;
            case 2:
                System.out.println("You take a strange Steel Ball from Gyro’s satchel.");
                System.out.println("It hums with hidden energy, vibrating in your hand.");
                System.out.println("Somehow, it feels like fate is spinning...");
                break;
            case 3:
                System.out.println("A rider on a fierce horse blocks your path. It’s Diego Brando!");
                System.out.println("He grins with arrogance: ‘Try not to fall behind, loser.’");
                System.out.println("His horse charges at you with terrifying speed...");
                break;
            default:
                System.out.println("You are lost in the dust of the race...");
                break;
        }
    }
}
