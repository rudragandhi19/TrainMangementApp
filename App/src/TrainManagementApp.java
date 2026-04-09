import java.util.*;
import java.util.stream.Collectors;

// Extended Bogie class with category
class Bogie {
    String name;
    int capacity;
    String category;

    public Bogie(String name, int capacity, String category) {
        this.name = name;
        this.capacity = capacity;
        this.category = category;
    }

    @Override
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

public class TrainManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72, "Passenger"));
        bogies.add(new Bogie("AC Chair", 78, "Passenger"));
        bogies.add(new Bogie("First Class", 24, "Passenger"));
        bogies.add(new Bogie("Cargo", 100, "Goods"));
        bogies.add(new Bogie("Parcel", 80, "Goods"));

        // Group bogies by category
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.category));

        // Display grouped result
        System.out.println("\nGrouped Bogies:");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("\nCategory: " + entry.getKey());
            for (Bogie b : entry.getValue()) {
                System.out.println("  " + b);
            }
        }

        System.out.println("\nGrouping completed successfully.");
    }
}