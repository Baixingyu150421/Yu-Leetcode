package newcode;

public class EntryNodeOfLoop {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead == null || pHead.next == null)
            return null;
        ListNode p1 = pHead;
        ListNode p2 = pHead;
        while (p1 != null && p2 != null){
            p1 = p1.next;
            p2 = p2.next.next;
            //有环
            if(p1 == p2){
                //快指针从头开始
                p2 = pHead;
                while(p1 != p2){
                    p1 = p1.next;
                    p2 = p2.next;
                }
                //相等时就是入环的节点
                if(p1 == p2)
                    return p1;
            }
        }
        return null;
    }
}
