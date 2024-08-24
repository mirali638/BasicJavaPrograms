interface StringInterface {
    int length(String str); 
}

// Define the abstract class implementing the interface
abstract class AbstractStringManipulator implements StringInterface {
    abstract String toggleString(String str);
}

// Concrete class implementing the abstract class
class StringManipulator extends AbstractStringManipulator {
    // Implementation of the interface method to calculate the length of the string
    public int length(String str) {
        return str.length();  
    }

    // Implementation of the abstract method to toggle the characters of the string
    public String toggleString(String str) {
        // Toggle each character of the string
        StringBuilder toggledString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                toggledString.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                toggledString.append(Character.toUpperCase(ch));
            } else {
                toggledString.append(ch);
            }
        }
        return toggledString.toString();
    }
}

public class toggleString {
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();

        String inputString = "Hello Mirali";
        System.out.println("Length of the string: " + manipulator.length(inputString));

        String toggledString = manipulator.toggleString(inputString);
        System.out.println("Toggled string: " + toggledString);
    }
}
