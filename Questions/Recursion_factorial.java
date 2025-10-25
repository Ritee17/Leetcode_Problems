package DSA.Leetcode_Problems.Questions;

public class Recursion_factorial {
    public static void main(String[] args) {
        int n =5;
        System.out.println(fact(n));
    }
    public static int fact(int n ){
        // base case
        if(n==1 || n==0){
            return 1;
        }
        // recursive case
        int fn = fact(n-1); // smaller problem
        return fn*n;
    }
}
