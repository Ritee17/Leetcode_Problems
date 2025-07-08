package DSA.Leetcode_Problems;

public class Q1 {
       public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=nums.length-1;j>=1;j--){
                if(nums[i] + nums[j]== target && i<j){
                arr[0]=i;
                arr[1]=j;
            }
            }
        }
        return arr;
    }
}
