package newcode;

import java.util.Stack;

public class IsPopOrder {
    public static void main(String[] args) {
        int [] pushA = {1,2,3,4,5};
        int [] popA = {4,3,5,1,2};
        boolean b = IsPopOrder(pushA, popA);
        System.out.println(b);
    }
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA == null || popA == null) return false;
        if(pushA == null && popA == null) return true;
        Stack<Integer> stack = new Stack<>();
        int i = 0 , j = 0;
        while(i < pushA.length && j <popA.length){
            if(stack.isEmpty()){
                stack.push(pushA[i]);
                continue;
            }
            if(stack.peek() == popA[j]){
                stack.pop();
                j++;
                if(i == popA.length) break;
            }else{
                i++;
                if(i == pushA.length) break;
                stack.push(pushA[i]);
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
