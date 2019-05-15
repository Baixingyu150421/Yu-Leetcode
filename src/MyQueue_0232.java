import java.util.Stack;
//MyQueue queue = new MyQueue();
//
//queue.push(1);
//queue.push(2);
//queue.peek();  // 返回 1
//queue.pop();   // 返回 1
//queue.empty(); // 返回 false

/**
 * 用栈实现队列
 */
public class MyQueue_0232 {
    public static void main(String[] args) {
        MyQueue_0232 myQueue_0232 = new MyQueue_0232();
        myQueue_0232.push(1);
        myQueue_0232.push(2);
        int peek = myQueue_0232.peek();
        System.out.println(peek);
        int pop = myQueue_0232.pop();
        System.out.println(pop);
        boolean empty = myQueue_0232.empty();
        System.out.println(empty);
    }

    Stack<Integer> stack1;
    Stack<Integer> stack2;
    /** Initialize your data structure here. */
    public MyQueue_0232() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        //放的时候都放a中
        stack1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        //取元素从Stack2中取，把stack1中元素的都放到stack2中
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    /** Get the front element. */
    public int peek() {
        //取元素从Stack2中取，把stack1中元素的都放到stack2中
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        //可能放的时候还没来得及去添加
        return stack2.isEmpty() && stack1.isEmpty();
    }
}
