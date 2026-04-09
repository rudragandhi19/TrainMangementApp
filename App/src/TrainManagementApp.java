import java.util.HashSet;
import java.util.Set;

public class TrainManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create HashSet for unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Adding bogie IDs (duplicates included intentionally)
        bogieIds.add("B101");
        bogieIds.add("B102");
        bogieIds.add("B103");
        bogieIds.add("B101"); // duplicate
        bogieIds.add("B102"); // duplicate

        // Display unique bogie IDs
        System.out.println("\nUnique Bogie IDs:");
        System.out.println(bogieIds);

        // Program continues...
        System.out.println("\nDuplicate entries were automatically ignored.");
    }
}