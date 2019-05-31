package newcode;

import java.util.ArrayList;

public class FindKthToTail {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head == null) return null;
        ArrayList<ListNode> list = new ArrayList<>();
        while (head != null){
            list.add(head);
            head = head.next;
        }
        if(k == 0) return null;
        if(list.size() < k) return null;
        return list.get(list.size() - k);
    }
}
