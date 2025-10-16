package DSA.Leetcode_Problems.Questions;
import java.lang.Math;

public class String_lexicographical {
    public static void main(String[] args) {
        String s1 = "komal";
        String s2 = "kunal" ;
        // +ve s1>s2
        // -ve s2>s1
        // 0 s1=s2
        System.out.println(s1.compareTo(s2));
    }
    public static int compareTo(String s1 , String s2){
        if(s1==s2){
            return 0;
        }
        int len = Math.min(s1.length(),s2.length());
        for(int i=0;i<len;i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return s1.charAt(i) - s2.charAt(i);
            }
        }
        return s1.length() - s2.length() ;
    }
}