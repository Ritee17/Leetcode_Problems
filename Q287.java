package DSA.Leetcode_Problems;

import java.util.Arrays;

public class Q287 {
      public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int count =0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                count=nums[i];
                break;
            }
        }
        return count;
    }
}
