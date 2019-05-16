public class hasCycle_0141 {
    //判断单链表是否成环
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        //注意从head位置开始
        ListNode slow = head;
        ListNode fast = head.next;
        //链表没有成环那么快指针最终会指向null
        while (fast != null && fast.next != null) {
            //否则在某一时刻快慢指针会相遇
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
