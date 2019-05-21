public class mergeTwoLists_0021 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        //构造一个新链表
        ListNode newList = new ListNode(0);
        ListNode t = newList;
        while(l1 != null || l2 != null){
            //一个链表到头就累加另一个链表
            int a = l1 != null ? l1.val : Integer.MAX_VALUE;
            int b = l2 != null ? l2.val : Integer.MAX_VALUE;
            if (a <= b) {
                t.next = new ListNode(a);
                t = t.next;
                l1 = l1.next;
            } else {
                t.next = new ListNode(b);
                t = t.next;
                l2 = l2.next;
            }
        }
        return newList.next;
    }
}
