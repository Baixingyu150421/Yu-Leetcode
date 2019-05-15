import java.util.Stack;
//使括号有效的最少添加  使用栈结构
public class minAddToMakeValid_0921 {
    public static void main(String[] args) {
        int i = minAddToMakeValid("()");
        System.out.println(i);
    }
    public  static int minAddToMakeValid(String S) {
        if(S == " ") return 0;
        Stack<Character> stack = new Stack<>();
        char[] chars = S.toCharArray();
        for(int i = 0 ; i < chars.length ; i++){
            if(chars[i] == ')' && !stack.isEmpty()){
                if(stack.peek() == '('){
                    stack.pop();
                }else {
                    stack.push(chars[i]);
                }
                continue;
            }
            stack.push(chars[i]);
        }
        return stack.size();
    }
}
