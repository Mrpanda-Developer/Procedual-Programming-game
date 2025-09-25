package Game;
import java.util.Random;
import java.util.Scanner;
/*
 * This class will handle the boss fight mechanics.
 * The player will face off against a boss with a simple turn-based combat system.
 * @param scanner The Scanner object for user input.
 */

 
public class BossFight {
    public static void startFight(Scanner scanner) {
        int playerHP = 900;
        int bossHP = 25;
        Random rand = new Random();

        System.out.println("\n⚔️  The Boss appears! 'Face the power of the Golden Spin!'\n");
        DiegoArt.show();
        System.out.println("Diego Brando appears on his horse!");
        System.out.println("'Try not to fall behind, loser...'");
        while (playerHP > 0 && bossHP > 0) {

            System.out.println("Your HP:  " + hpBar(playerHP));
            System.out.println("Boss HP: " + hpBar(bossHP));

            System.out.print("\nChoose your action (attack / dodge / heal): ");
            String action = scanner.nextLine().trim().toLowerCase();

            String[] bossMoves = {"spin attack", "kick", "golden ratio blast"};
            String bossMove = bossMoves[rand.nextInt(bossMoves.length)];
            int bossDamage = rand.nextInt(6) + 3; 

            
            if (action.equals("attack")) {
                int dmg = rand.nextInt(5) + 2; 
                System.out.println("You strike the Boss for " + dmg + " damage!");
                bossHP -= dmg;
            } else if (action.equals("dodge")) {
                System.out.println("You prepare to dodge...");
            } else if (action.equals("heal")) {
                int heal = rand.nextInt(4) + 2;
                playerHP = Math.min(20, playerHP + heal);
                System.out.println("You heal for " + heal + " HP!");
            } else {
                System.out.println("You hesitate... (invalid action)");
            }

            // Boss action
            if (bossHP > 0) {
                System.out.println("Boss uses " + bossMove + "!");
                if (action.equals("dodge") && rand.nextBoolean()) {
                    System.out.println("You dodged the attack!");
                } else {
                    System.out.println("You take " + bossDamage + " damage!");
                    playerHP -= bossDamage;
                }
            }

            System.out.println("-----------------------------------");
        }

        // Eindresultaat
        if (playerHP <= 0 && bossHP <= 0) {
            System.out.println("💀 You both collapse... It's a draw!");
        } else if (playerHP <= 0) {
            System.out.println("❌ The Boss defeats you...");
        } else {
            System.out.println("🏆 The Boss falls before your determination!");
            Animation.bossDefeated();
        }
    }

    // Helper voor HP-bar
    private static String hpBar(int hp) {
        int maxHP = 25;
        int length = 20;
        int filled = (int) ((hp / (double) maxHP) * length);
        StringBuilder bar = new StringBuilder("[");
        for (int i = 0; i < length; i++) {
            bar.append(i < filled ? "#" : " ");
        }
        bar.append("] ").append(Math.max(hp, 0)).append(" HP");
        return bar.toString();
    }
}
