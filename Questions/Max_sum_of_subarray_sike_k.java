package DSA.Ques;
import java.lang.Math;
public class Max_sum_of_subarray_sike_k {
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,7,2,6,4,5};
        int k=3;
        System.out.println(MaxSum(arr, k));
    }
    public static int MaxSum(int[] arr , int k ){
        int sum =0;
        int ans=0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        ans = sum;
        for (int i = k; i < arr.length; i++) {
            sum += arr[i];
            sum -= arr[i-k];
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
