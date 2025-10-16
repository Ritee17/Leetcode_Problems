package DSA.String;

public class Palindrome {
    public static void main(String[] args) {
        String s = "Nitin";
        System.out.println(palindrome(s));
    }
    public static boolean palindrome(String s){
        int i =0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }    
}

