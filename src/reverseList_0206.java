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
    //迭代法
    public ListNode reverseList2(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }
        return pre;
    }
}

