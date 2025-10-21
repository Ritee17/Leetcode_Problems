package DSA.Leetcode_Problems.Questions;

public class substsring_by_length {
    public static void main(String[] args) {
        String str = "Hello";
        Substring(str);
    }

    public static void Substring (String str){
        for (int len = 1; len <= str.length(); len++) {
            for (int j = len; j <= str.length(); j++) {
                int i = j-len;
                System.out.println(str.substring(i,j));
            }
        }
    }
    
}

