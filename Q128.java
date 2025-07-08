package DSA.Leetcode_Problems;

import java.util.Arrays;

public class Q128 {
     public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int maxi =0;
        int count=1;
        if(nums.length==0){
            return 0;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                if(nums[i] == nums[i - 1]+1){
                    count++;
                }
                else{
                    maxi = Math.max(maxi,count);
                    count =1;
                }
            }
        }
        return Math.max(maxi,count);
    }
}
