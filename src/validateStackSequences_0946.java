import java.util.Stack;

public class validateStackSequences_0946 {
    //使用栈模拟入栈出栈过程
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if(pushed.length == 0) {
            return true;
        }
        if(pushed.length == 0 && pushed[0] != popped[0]) {
            return false;
        }
        Stack<Integer> stack =  new Stack<>();
        int j = 0;
        for(int i = 0 ; i < pushed.length ; i++) {
            if(pushed[i] != popped[j]) {
                stack.push(pushed[i]);
                continue;
            }
            else {
                if(j == popped.length  - 1) {
                    break;
                }
                j++;
                if(!stack.isEmpty()) {
                    while(!stack.isEmpty() && j < popped.length && popped[j] == stack.peek() ) {
                        j++;
                        stack.pop();
                    }
                }
                continue;
            }
        }
        while(!stack.isEmpty()) {
            if(stack.peek() == popped[j++]) {
                stack.pop();
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
