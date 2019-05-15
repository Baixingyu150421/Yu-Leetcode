import java.util.Stack;

public class isValid_0020 {
    public static void main(String[] args) {
        boolean valid = isValid("{[]}");
        System.out.println(valid);
    }

    /**
     * 栈的应用  判断括号的有效性
     * @param s
     * @return
     */
    public  static boolean isValid(String s) {
        if(s == " ") return true;
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for(int i = 0 ; i < chars.length ; i++){

            //|| chars[i] == '}' || chars[i] == ']'
            if(chars[i] == ')' && !stack.isEmpty()){
                if(stack.peek() == '('){
                    stack.pop();
                    continue;
                }else {
                    return false;
                }
            }else if(chars[i] == '}' && !stack.isEmpty()){
                if(stack.peek() == '{'){
                    stack.pop();
                    continue;
                }else {
                    return false;
                }

            }else if(chars[i] == ']' && !stack.isEmpty()){
                if(stack.peek() == '['){
                    stack.pop();
                    continue;
                }else {
                    return false;
                }
            }
            stack.push(chars[i]);
        }

        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
