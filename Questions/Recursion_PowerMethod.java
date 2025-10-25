package DSA.Leetcode_Problems.Questions;

public class Recursion_PowerMethod {
    public static void main(String[] args) {
        int a =3;
        int b=5;
        System.out.println(pow(a,b));
    }
    public static int pow(int a , int b){
    // base case
        if(b==0){
            return 1;
        }
        int ans = pow(a,b-1);
        return ans*a;
    }
}
