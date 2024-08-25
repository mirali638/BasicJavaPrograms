// write a program to count the 
// occurrence of a character in a string

// Write a program to take string input as command line argument. In 
// addition, count occurrence of each character in a given string
public class exam21 {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java CharacterCount <input_string>");
            return;
        }

        String input = args[0];
        countCharacters(input);
    }

    public static void countCharacters(String input) {
        // Create an array to store character counts
        int[] charCounts = new int[256]; // Assuming ASCII characters

        // Count occurrences of each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            charCounts[ch]++;
        }

        // Display character counts
        System.out.println("Character counts for input string:");
        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] > 0) {
                System.out.println((char) i + ": " + charCounts[i]);
            }
        }
    }
}

