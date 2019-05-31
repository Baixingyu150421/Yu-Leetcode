package Test;

import java.util.Stack;

public class chkParenthesis {
    public static void main(String[] args) {
        String a = "()()(((())))";
        boolean b = chkParenthesis(a, 12);
        System.out.println(b);
    }
    //检测字符串的合法性
    public static boolean chkParenthesis(String A, int n) {
        char[] chars = A.toCharArray();
        boolean first = false;
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < chars.length ; i++){
            if(chars[i] != 40 && chars[i] != 41){
                return false;
            }
            if(first == false  && chars[i] == 41){
                return false;
            }
            if(first == false && chars[i] == 40 ){
                stack.push(chars[i]);
                first = true;
            }
            if(!stack.isEmpty()  && chars[i] == 41){
                stack.pop();
                continue;
            }
        }

        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
