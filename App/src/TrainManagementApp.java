import java.util.ArrayList;
import java.util.List;

// Goods Bogie class
class GoodsBogie {
    String type;
    String cargo;

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " Bogie carrying " + cargo;
    }
}

public class TrainManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create list of goods bogies
        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Box", "Coal"));
        goodsBogies.add(new GoodsBogie("Flatbed", "Machinery"));

        // Display bogies
        System.out.println("\nGoods Bogies:");
        goodsBogies.forEach(System.out::println);

        // Safety validation using allMatch()
        boolean isSafe = goodsBogies.stream()
                .allMatch(b ->
                        // Rule: Cylindrical bogie → only Petroleum allowed
                        !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum")
                );

        // Display result
        System.out.println("\nSafety Check Result:");
        if (isSafe) {
            System.out.println("Train is SAFE for operation ✅");
        } else {
            System.out.println("Train is NOT SAFE ❌");
        }

        System.out.println("\nValidation completed successfully.");
    }
}