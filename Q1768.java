package DSA.Leetcode_Problems;

public class Q1768 {
    public String Merge(String word1, String word2){
        StringBuilder s = new StringBuilder();
        int i =0;
        int j=0;
        boolean flag = true;
        while(i< word1.length() && j< word2.length()){
            if(flag){
                s.append(word1.charAt(i));
                i++;
            }
            else{
                s.append(word2.charAt(j));
                j++;
            }
            flag = !flag;
        }
        while(i<word1.length()){
            s.append(word1.charAt(i));
            i++;
        }
        while(j<word2.length()){
            s.append(word2.charAt(j));
            j++;
        }
        return s.toString();
    }
}
