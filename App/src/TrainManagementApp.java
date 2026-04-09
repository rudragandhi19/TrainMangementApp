import java.util.ArrayList;
import java.util.List;

public class TrainManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // ADD bogies (Create operation)
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display bogies after insertion (Read operation)
        System.out.println("\nBogies after addition:");
        System.out.println(passengerBogies);

        // REMOVE a bogie (Delete operation)
        passengerBogies.remove("AC Chair");

        System.out.println("\nBogies after removal of 'AC Chair':");
        System.out.println(passengerBogies);

        // CHECK existence (Read operation)
        boolean exists = passengerBogies.contains("Sleeper");

        System.out.println("\nDoes 'Sleeper' bogie exist? " + exists);

        // Final list state
        System.out.println("\nFinal Train Consist:");
        System.out.println(passengerBogies);

        // Program continues...
        System.out.println("\nOperations completed successfully.");
    }
}