package DSA.Leetcode_Problems;
import java.util.Scanner;

public class Q151{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
        System.out.println(s.trim());
        sc.close();
    }
    public static String Reverse_words(String s){
        s = s.trim();
        String[] arr = s.split("\s+");
        String ans = "";
        for(int i=arr.length-1 ; i>=0 ; i--){
            ans + = arr[i]+ " ";
        }
        ans.trim();
        return ans;
    }
}