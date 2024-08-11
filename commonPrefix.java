public class commonPrefix {
    public static void main(String[] args) {
        Solution solution = new Solution();
    
        String[] strs1 = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "racecar", "car"};
        String[] strs3 = {"interview", "intermediate", "internal", "internet"};
        
        System.out.println("Longest common prefix of strs1: " + solution.longestCommonPrefix(strs1)); // Output: "fl"
        System.out.println("Longest common prefix of strs2: " + solution.longestCommonPrefix(strs2)); // Output: ""
        System.out.println("Longest common prefix of strs3: " + solution.longestCommonPrefix(strs3)); // Output: "inte"
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        
        String prefix = strs[0];
        
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
