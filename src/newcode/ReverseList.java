package newcode;

import java.util.Stack;

public class ReverseList {
    public class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }
    //使用栈结构为什么输出为空
    public ListNode ReverseList1(ListNode head) {
        if(head == null) return null;
        Stack<ListNode> stack = new Stack<>();
        while (head != null){
            stack.push(head);
            head = head.next;
        }
        ListNode newNode = new ListNode(0);
        while (!stack.isEmpty()){
            newNode.next = new ListNode(stack.pop().val);
            newNode = newNode.next;
        }
        return newNode.next;
    }

    public ListNode ReverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        //当前节点的前置节点
        ListNode pre = null;
        //当前节点的后继节点
        ListNode next = null;

        while (head != null){
               //防止断链
               next = head.next;
               //修改节点的next
               head.next =pre;
               //重复这个操作后移
               pre = head;
               head = next;
        }
        //返回以null为头的链表
        return pre;
    }


}
