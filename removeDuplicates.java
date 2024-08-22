public class removeDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4, 5, 5, 6, 8, 4};
        Solution solution = new Solution();
        int length = solution.removeDuplicates(nums);
        
        // Print the array with unique elements
        System.out.print("Array with unique elements: ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]){ 
            nums[j++] = nums[i];
            }
        }
        return j;
    }
}
