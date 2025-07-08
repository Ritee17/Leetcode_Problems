package DSA.Leetcode_Problems;

public class Q27 {
      public int removeElement(int[] nums, int val) {
        int k =0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==val){
                nums[i]=0;
            }
            else{
                k++;
            }
        }
        for(int turn=1;turn<n;turn++){
            for(int j=0;j<n-turn;j++){
                if(nums[j]==0){
                    nums[j]=nums[j+1];
                    nums[j+1]=0;
                }
            }
        }
        return k;
    }
}
