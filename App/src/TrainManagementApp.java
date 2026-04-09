import java.util.ArrayList;
import java.util.List;

public class TrainManagementApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Initialize empty train consist using ArrayList
        List<String> trainConsist = new ArrayList<>();

        // Display initial bogie count
        System.out.println("Initial Bogie Count: " + trainConsist.size());

        // Program continues...
        System.out.println("System initialized successfully.");
    }
}