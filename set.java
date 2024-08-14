// A Set is a collection that does not allow duplicate elements.

// It's typically used when you need to store a collection of unique elements.

// Java provides several implementations of the Set interface, such as HashSet, TreeSet, and LinkedHashSet.
import java.util.*;

public class set {
    public static void main(String[] args) {
        // Creating a HashSet
        Set<String> names = new HashSet<>();

        // Adding elements to the set
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Alice"); // Duplicate element, won't be added

        // Displaying elements of the set
        System.out.println("Names in the set:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
