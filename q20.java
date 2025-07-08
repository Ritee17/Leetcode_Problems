package DSA.Leetcode_Problems;

import java.util.Stack;

public class q20 {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (!st.isEmpty()) {
                char last = st.peek();
                if (pair(last, cur)) {
                    st.pop();
                    continue;
                }
            }
            st.push(cur);
        }

        return st.isEmpty();        
    }

    private boolean pair(char last, char cur) {
        return (last == '(' && cur == ')') ||
               (last == '{' && cur == '}') ||
               (last == '[' && cur == ']');
    }    
}
