package DSA.Leetcode_Problems;

public class Q162 {
      public int findPeakElement(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                k = i+1;
            }
        }
        return k;
    }
}
