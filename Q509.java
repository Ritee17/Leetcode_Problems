package DSA.Leetcode_Problems;

public class Q509 {
     public int fib(int n) {
        int a=0;
        int b=1;
        for(int i=1;i<=n;i++){
            int c=a+b;
            a=b;
            b=c;
        }
        return a;
    }
}
