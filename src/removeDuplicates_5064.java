import java.util.Stack;
//移除重复的元素 利用栈结构
public class removeDuplicates_5064 {
    public static void main(String[] args) {
        String abbaca = removeDuplicates("abbaca");
        System.out.println(abbaca);
    }
    public  static String removeDuplicates(String S) {
        if(S == null || S.length() < 1 ) return null;
        if(S.length() == 1)return S;
        Stack<Character> stack = new Stack<>();
        char[] chars = S.toCharArray();
        for(int i = 0 ; i < S.length() ; i ++){
            if( !stack.isEmpty() && chars[i] == stack.peek()){
                stack.pop();
                continue;
            }
            stack.push(chars[i]);
        }
        StringBuilder sb = new StringBuilder();
        if(stack.isEmpty()){
            return "";
        }
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
