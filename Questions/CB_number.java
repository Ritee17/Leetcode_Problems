package DSA.String;
// Whats is CB number ?
// 1) 0 and 1 are not CB
// 2) 1,3,5,7,11,13,17,19,23,29 are CB numbers
// 3) a number not divisible by the numbers in point 2 is a CB number
// find the maximum number of CB number in a string 
import java.lang.*;
public class CB_number {
    public static void main(String[] args) {
        String str = "828192";
        Substring(str);
    }

    public static void Substring(String str){
        int count =0;
        boolean [] visited = new boolean[str.length()];
        for(int len = 1; len <= str.length(); len++) {
            for (int j = len; j <= str.length(); j++) {
                int i = j-len;
                String s = str.substring(i, j) ;// string number
                if(iscbnumber(Long.parseLong(s))==true && isvisitied(visited,i,j-1)==true){
                    count++;
                    for (int k = i; k < j; k++) {
                        visited[k] = true; // marked 
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static boolean isvisitied(boolean [] visited , int i , int j){
        for (int k = i; k <= j; k++) {
            if(visited[k]==true){
                return false;
            }
        }
        return true;
    }

    public static boolean iscbnumber(long num){
        if(num==0 || num ==1){
            return false;
        }
        int[] arr = {2,3,5,7,11,13,17,19,23,29};
        for(int i=0;i<arr.length;i++){
            if(num == arr[i]){
                return true;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(num % arr[i] == 0){
                return false;
            }
        }
        return true;
    }
}
