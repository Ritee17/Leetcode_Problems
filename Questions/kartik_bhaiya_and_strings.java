package DSA.Leetcode_Problems.Questions;
import java.lang.Math;


public class kartik_bhaiya_and_strings {
    public static void main(String[] args) {
        String str = "aabababbabaaaaaaaa";
        int k = 3;
        int flipa = maxlen(str, k , 'a');
        int flipb = maxlen(str, k , 'b');
        System.out.println(Math.max(flipa, flipb));
    }
    public static int maxlen(String str , int k, char ch){
        int si =0;
        int ei=0;
        int ans =0;
        int flip=0;
        while(ei<str.length()){
            // grow the window
            if(str.charAt(ei)==ch){
                flip++;
            }
            // shrink the window
            while(flip>k){
                if(str.charAt(si)==ch){
                    flip--;
                }
                si++;
            }
            // calculate the ans
            ans = Math.max(ans,ei-si+1);
            ei++;
        }
        return ans;

    }
}
