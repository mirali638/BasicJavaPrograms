public class removeElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        Solution s = new Solution();

        int k = s.removeElement(nums, val);
        System.out.print("Number of elements not equal to " + val + ": " + k + " which is ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
class Solution {
    public int removeElement(int[] nums, int val) {
        int k =0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}