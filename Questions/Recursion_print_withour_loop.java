package DSA.Leetcode_Problems.Questions;

public class Recursion_print_withour_loop {
    public static void main(String[] args) {
        int n =5;
        dec_PD(n);
        inc_PD(n);
        
    }
    public static void dec_PD(int n){
        // base case
       if(n==0){
        return;
       }
        // recursive case
       System.out.println(n);
       dec_PD(n-1);
    }
    public static void inc_PD(int n){
        // base case
       if(n==0){
        return;
       }
        // recursive case
       inc_PD(n-1);
       System.out.println(n);
    }
}
