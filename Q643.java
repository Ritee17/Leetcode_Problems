package DSA.Leetcode_Problems;

public class Q643 {
     public static double Average(int[] nums , int k){
        int sum = 0;
        double ans =0.0;
        double avg =0.0;
        for(int i=0;i<k;i++){
            sum += nums[i]; // start window
        }
        avg += sum *1.0 /k;
        ans = avg;
        for(int i=k;i<nums.length;i++){
            sum += nums[i]; // grow window
            sum -= nums[i-k];
            avg = sum*1.0/k;
            ans = Math.max(ans,avg);
        }
        return ans;
}
}