package newcode;


import java.util.HashMap;

public class FindFirstCommonNode {
    public class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }
    //两个链表的公共节点
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        //利用hashMap的性质
        ListNode current1 = pHead1;
        ListNode current2 = pHead2;
        HashMap<ListNode, Integer> hashMap = new HashMap<ListNode, Integer>();
        while (current1 != null) {
            hashMap.put(current1, null);
            current1 = current1.next;
        }
        while (current2 != null) {
            if (hashMap.containsKey(current2))
                return current2;
            current2 = current2.next;
        }

        return null;
    }
}
