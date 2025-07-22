package DSA.Leetcode_Problems;

public class Q713 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2};
        int k =10;
        System.out.println(Product_less_than_K(arr, k));
    }
    public static int Product_less_than_K(int[] arr , int k){
        int si =0;
        int ei=0;
        int p = 1;
        int ans=0;
        while(ei<arr.length){
            //growing
            p = p* arr[ei];
            // shrinking
            while(p>=k){
                p = p/arr[si];
                si++;
            }
            // ans 
            ans = ans + (ei-si+1);
            ei++;
        }
        return ans;
    }
}
