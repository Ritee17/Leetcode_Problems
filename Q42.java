package DSA.Leetcode_Problems;

public class Q42 {
    public int trap(int[] height) {
        return Trapping(height);
    }
    public static int Trapping(int[] arr){
        int n = arr.length;
        // max in left left array
        int[] left = new int[n];
        left[0] = arr[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],arr[i]);
        }
        // max in right array
        int[] Right = new int[n];
        Right[n-1] = arr[n-1];
        for(int i =n-2;i>=0;i--){
            Right[i] = Math.max(Right[i+1],arr[i]);
        }
        // area 
        int sum=0;
        for(int i = 0; i<n;i++){
            sum += Math.min(left[i],Right[i]) - arr[i];
        }
        return sum;
    }
}
