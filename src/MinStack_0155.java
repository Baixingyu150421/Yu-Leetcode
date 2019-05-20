import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MinStack_0155 {
    //for test
    public static void main(String[] args) {
        MinStack_0155 minStack = new MinStack_0155();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        int top = minStack.top();
        System.out.println(top);
        int min = minStack.getMin();
        System.out.println(min);
    }
    Stack<Integer> main = null;
    Stack<Integer> help = null;

    public MinStack_0155() {
        main = new Stack<Integer>();
        help = new Stack<Integer>();
    }
    //压栈
    public void push(int x) {
        main.push(x);
        if(help.isEmpty()){
            help.push(x);
        }else{
            if(x <= help.peek()){
                help.push(x);
            }
        }
    }
    //弹栈
    public void pop() {
        if(!main.isEmpty()){
            int a =  main.pop();
            if(a == help.peek()){
                help.pop();
            }
        }
    }
    //get top
    public int top() {
        if(main.isEmpty()){
            throw  new RuntimeException("error!");
        }
        return main.peek();
    }
    //getMin
    public int getMin() {
        return help.peek();
    }

}
