package DSA.Leetcode_Problems;

public class Q258 {
    public int addDigits(int num) {
        String a = Integer.toString(num);
        int sum =0;
        while(a.length()>1){
            for(int i=0;i<a.length();i++){
                sum = sum+Integer.parseInt(Character.toString(a.charAt(i)));
            }
            a=Integer.toString(sum);
            sum=0;
        }
        return Integer.parseInt(a);
    }
}
