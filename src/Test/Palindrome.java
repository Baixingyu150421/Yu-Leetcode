package Test;

import java.util.*;


public class Palindrome {

    public class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }
    //判断一个链表是不是回文链表
    //使用快慢指针  构造回文串  使用栈结构
    public boolean isPalindrome(ListNode pHead) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(pHead == null){
            return false;
        }
        ListNode node = pHead;
        while(node != null){
            list.add(node.val);
            node = node.next;
        }
        int N = list.size();
        for(int i = 0;i < N/2; i++){
            if(list.get(i) != list.get(N-i-1)){
                return false;
            }
        }
        return true;
    }
}