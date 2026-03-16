import java.util.HashMap;
import java.util.Map;

// RoomInventory class to manage centralized inventory
class RoomInventory {

    private HashMap<String, Integer> inventory;

    // Constructor initializes inventory
    public RoomInventory() {
        inventory = new HashMap<>();

        // Register room types with available counts
        inventory.put("Single Room", 5);
        inventory.put("Double Room", 3);
        inventory.put("Suite Room", 2);
    }

    // Method to get availability of a room type
    public int getAvailability(String roomType) {
        return inventory.getOrDefault(roomType, 0);
    }

    // Method to update room availability
    public void updateAvailability(String roomType, int count) {
        if (inventory.containsKey(roomType)) {
            inventory.put(roomType, count);
        } else {
            System.out.println("Room type not found.");
        }
    }

    // Display entire inventory
    public void displayInventory() {
        System.out.println("---- Current Room Inventory ----");

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + " rooms available");
        }
    }
}

// Main Class
public class problem3 {

    public static void main(String[] args) {

        // Initialize inventory system
        RoomInventory inventory = new RoomInventory();

        // Display current inventory
        inventory.displayInventory();

        System.out.println();

        // Retrieve availability
        System.out.println("Single Room Available: " + inventory.getAvailability("Single Room"));

        // Update inventory
        inventory.updateAvailability("Single Room", 4);

        System.out.println();
        System.out.println("After Update:");

        // Display updated inventory
        inventory.displayInventory();
    }
}