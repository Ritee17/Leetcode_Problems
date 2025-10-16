package DSA.Ques;
import java.lang.Math;
public class sliding_window {
    public  static void main(String[] args){
        int[] arr = {2,5,1,3,6,47,4,8,9,7};
        int k = 3;
        System.out.println(window(arr,k));
    }
    public static int window(int[] arr, int k){
        int sum =0;
        int ans=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        ans = sum;
        for(int i=k;i<arr.length;i++){
            sum+=arr[i];
            sum -= arr[i-k];
            ans = Math.max(sum,ans);
        }
        return ans;
    }
}