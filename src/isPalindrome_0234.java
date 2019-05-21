import java.util.Stack;
//判断一个单链表是否是回文链表
public class isPalindrome_0234 {
    //法1：
    public boolean isPalindrome(ListNode head) {
        //定义快慢指针，与一个空栈
        if(head == null || head.next == null) return true;
        Stack<ListNode> stack = new Stack<>();
        ListNode slow = head;
        ListNode fast = head;
        stack.push(slow);
        //快指针走到链表尾部时，慢指针走到中间位置，存放元素到栈中
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            stack.push(slow);
            fast = fast.next.next;
        }
        //判断奇偶
        if(fast.next != null) {
            slow = slow.next;
        }
        //奇数时栈中多加入了一个元素
        else {
            slow = slow.next;
            stack.pop();
        }
        //弹栈与链表的后半部分进行比较
        while(!stack.isEmpty()) {
            if(slow.val != stack.pop().val) {
                return false;
            }
            slow = slow.next;
        }
        return true;
    }
}
