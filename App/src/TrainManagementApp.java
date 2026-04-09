import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Custom Bogie class
class Bogie {
    String name;
    int capacity;

    // Constructor
    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // toString() for easy display
    @Override
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

public class TrainManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create List of Bogie objects
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 78));
        bogies.add(new Bogie("First Class", 24));

        // Display before sorting
        System.out.println("\nBefore Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Sort using Comparator (by capacity)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Display after sorting
        System.out.println("\nAfter Sorting by Capacity:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nSorting completed successfully.");
    }
}