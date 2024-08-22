public class palindromCheck {
        public static void main(String[] args) {
            for (String word : args) {
                // Reverse the word
                String reversedWord = reverseWord(word);
                // Check if the reversed word is a palindrome
                boolean isPalindrome = checkPalindrome(reversedWord);
                // Display the result
                System.out.println("Word: " + word);
                System.out.println("Reversed word: " + reversedWord);
                System.out.println("Palindrome: " + isPalindrome);
                System.out.println();
            }
        }
    
        // Method to reverse a word
        public static String reverseWord(String word) {
            StringBuilder reversedWord = new StringBuilder();
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord.append(word.charAt(i));
            }
            return reversedWord.toString();
        }
    
        // Method to check if a word is a palindrome
        public static boolean checkPalindrome(String word) {
            int left = 0;
            int right = word.length() - 1;
            while (left < right) {
                if (word.charAt(left) != word.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }
     
