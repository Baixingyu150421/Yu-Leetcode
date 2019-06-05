package vivo;


import java.util.ArrayList;
import java.util.Stack;

//题目:反转链表中的m到n位置
public class VivoTest2 {
    //定义链表结构
    public class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }
    //for test
    public static void main(String[] args) {

    }
    public static void solution(ListNode node , int m , int n){
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode temp = node;
        while (temp != null){
            list.add(temp);
            temp = temp.next;
        }
        Stack<ListNode> stack = new Stack<>();
        for(int i = m - 1;  i < n ;  i++){
            stack.push(list.get(i));
        }
        for(int j = 0 ; j < list.size() ; j++){
            if(j >= m - 1 && j < n){
                System.out.println(stack.push(list.get(j)) + " ");
                continue;
            }else {
                if(j == list.size() - 1){
                    System.out.println(list.get(j));
                }else {
                    System.out.println(list.get(j) + " ");
                }
            }
        }
    }
}
