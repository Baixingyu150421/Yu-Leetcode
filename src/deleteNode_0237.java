public class deleteNode_0237 {

    //输入: head = [4,5,1,9], node = 5
    //输出: [4,1,9]
    //解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
    //无法操作之前的节点，所以就跳过后一个节点  达到删除这个节点的效果
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
