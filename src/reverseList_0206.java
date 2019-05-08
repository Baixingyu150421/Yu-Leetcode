// Definition for singly-linked list.
 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
public class reverseList_0206 {
    public ListNode reverseList(ListNode head) {
        return revervse(null ,head);
    }
    public static ListNode revervse(ListNode pre , ListNode current){
        if(current == null){
            return pre;
        }
        ListNode next = current.next;
        current.next = pre;
        return revervse(current,next);
    }
}

