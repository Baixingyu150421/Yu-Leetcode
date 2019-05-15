public class middleNode_0876 {
    //返回单链表的中间节点 快慢指针
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return fast.next==null?slow:slow.next;
    }
}
