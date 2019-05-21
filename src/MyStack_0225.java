import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
// * Your MyStack object will be instantiated and called as such:
// * MyStack obj = new MyStack();
// * obj.push(x);
// * int param_2 = obj.pop();
// * int param_3 = obj.top();
// * boolean param_4 = obj.empty();
public class MyStack_0225 {
    /** Initialize your data structure here. */
    Queue<Integer> queue ;
    Queue<Integer> tempQueue;
    public MyStack_0225() {
        queue =  new LinkedList<>();
        tempQueue = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        //添加的时候添加到queue中
        queue.offer(x);
        //始终保持队列头是最新添加的元素
        while (!tempQueue.isEmpty()){
            queue.offer(tempQueue.poll());
        }
        //然后把queue置空
        Queue temp = queue;
        queue = tempQueue;
        tempQueue = temp;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return tempQueue.poll();
    }

    /** Get the top element. */
    public int top() {
        return tempQueue.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return tempQueue.isEmpty();
    }
}
