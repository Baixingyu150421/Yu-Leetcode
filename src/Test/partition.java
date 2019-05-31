package Test;

public class partition {

public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        if(pHead == null) return null;
        ListNode small = new ListNode(-1);
        ListNode big = new ListNode(-1);
        ListNode smallHead = small;
        ListNode bigHead = big;
        ListNode cur = pHead;
        while (cur != null) {
            if(cur.val < x){
                small.next = cur;
                small = small.next;
            }else {
                big.next = cur;
                big = big.next;
            }
            cur = cur.next;
        }
        small.next = bigHead.next;
        //big设置为null
        big.next = null;
        return smallHead.next;
    }
}
