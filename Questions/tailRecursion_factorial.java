package DSA.Leetcode_Problems.Questions;

public class tailRecursion_factorial {
    public static void main(String[] args) {
        int n = 5;
            System.out.println(fact(n,1));
        }
        public static int fact(int n , int ans){
            //  base case
            if(n==1 || n==0){ 
                return ans ;
            }
            // tail recursion
            return fact(n-1,ans*n);
    }
}
