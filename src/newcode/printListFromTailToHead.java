package newcode;

import java.util.ArrayList;

public class printListFromTailToHead {
    public class ListNode {
       int val;
       ListNode next = null;
       ListNode(int val) {
            this.val = val;
       }
    }
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> result2 = new ArrayList<>();
        ListNode head = listNode;
        while (head != null){
            result.add(head.val);
            head = head.next;
        }
        for(int i = result.size() - 1 ; i >= 0 ; i --){
            result2.add(result.get(i));
        }
        return result2;
    }
}
