package DSA.Leetcode_Problems;

public class Q283 {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        while(j<nums.length){
            if(nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            j++;
        }
    }
}
