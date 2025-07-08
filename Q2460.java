package DSA.Leetcode_Problems;

public class Q2460 {
    public int[] applyOperations(int[] nums) {
        for(int i=0 ; i<nums.length-1 ;i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }
            else{
                continue;
            }
        }
        int[] arr = new int[nums.length];
        int k=0;
        for(int j=0;j<=nums.length-1;j++){
            if(nums[j]!=0){
                arr[k]=nums[j];
                k++;
            }
        }
        return arr;
    }
}
