package newcode;

public class Clone {
    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }
    public RandomListNode Clone1(RandomListNode pHead)
    {
        if(pHead == null) return null;
        RandomListNode root = new RandomListNode(pHead.label);
        root.next = pHead.next;
        root.random = pHead.random;
        root.next = Clone1(pHead.next);
        return root;
    }



    public RandomListNode Clone(RandomListNode pHead) {
        if(pHead == null){
            return  null;
        }
        //1.复制链表
        RandomListNode currentNode = pHead;
        while (currentNode != null){
            //新建节点
            RandomListNode cloneNode = new RandomListNode(currentNode.label);
            //保存原始节点之后的链
            RandomListNode nextNode = currentNode.next;
            //使当前节点指向新建的节点
            currentNode.next = cloneNode;
            //新插入的节点指向原来的next节点
            cloneNode.next = nextNode;
            //移动到下一个原始节点位置
            currentNode = nextNode;
        }
        //2.复制random指针
        currentNode = pHead;
        while (currentNode != null){
            //新节点的random指针  取决于原始节点是否有random指针   这里不太懂
            currentNode.next.random = currentNode.random == null ? null : currentNode.random.next;
            //每次都跳过复制节点 去原始节点
            currentNode = currentNode.next.next;
        }
        //3.将新链表与原链表分离
        //原始节点的头
        currentNode = pHead;
        //复制之后的节点的头
        RandomListNode pCloneHead = pHead.next;
        while (currentNode != null){
            //第一个复制的节点
            RandomListNode cloneNode = currentNode.next;
            //原节点的下一个节点就是复制节点的下一个节点
            currentNode.next = cloneNode.next;
            //复制后的心链表需要有自己的null节点
            cloneNode.next = cloneNode.next == null ? null : cloneNode.next.next;
            //原节点后移
            currentNode = currentNode.next;
        }
        //返回新链表的头指针
        return pCloneHead;
    }
}
