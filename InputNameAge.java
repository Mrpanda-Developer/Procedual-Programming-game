import java.util.Scanner;

public class InputNameAge {

    public static String getName(Scanner scanner) {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        return name.trim().isEmpty() ? "Unknown" : name;
    }

    public static int getAge(Scanner scanner) {
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();
        scanner.nextLine(); 
        
        int currentYear = java.time.Year.now().getValue();
        return currentYear - birthYear;
    }
}
