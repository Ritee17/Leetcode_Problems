package DSA.Leetcode_Problems;

public class Q2427 {
    public int commonFactors(int a, int b) {
        int n = Math.min(a,b);
        int count=0;
        for(int i=1;i<=n;i++){
            if(a%i==0 && b%i==0){
                count+=1;
            }
        }
        return count;
    }
}
