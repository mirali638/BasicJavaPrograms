// A Map is a collection of key-value pairs where each key is associated with a value.

// It's used when you need to store and retrieve data based on keys.

// Java provides several implementations of the Map interface, such as HashMap, TreeMap, and LinkedHashMap.
import java.util.*;

public class map{
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> ages = new HashMap<>();

        // Adding key-value pairs to the map
        ages.put("Alice", 30);
        ages.put("Bob", 25);
        ages.put("Charlie", 35);

        // Retrieving values from the map
        System.out.println("Age of Alice: " + ages.get("Alice"));
        System.out.println("Age of Bob: " + ages.get("Bob"));

        // Iterating over the map and printing key-value pairs
        System.out.println("All key-value pairs in the map:");
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
