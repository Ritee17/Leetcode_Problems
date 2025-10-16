package DSA.Leetcode_Problems.Questions;
import java.util.Scanner;
import java.lang.Math;

public class play_with_good_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String s = sc.next();
        System.out.println(longest_Good_Strings(s));
        sc.close();
    }

    public static int longest_Good_Strings(String s){
        int count =0; int ans =0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(isvowel(ch)==true){
                count++;
            }
            else{
                ans = Math.max(ans,count);
            }
        }
        ans = Math.max(ans,count);
        return ans;
    }
    public static boolean isvowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
}

