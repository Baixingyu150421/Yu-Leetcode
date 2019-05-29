package newcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class PrintZigZag {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;

        }
    }
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        if(pRoot == null) return list;
        ArrayList<Integer> list1 = new ArrayList<>();
        //双端队列
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        linkedList.addLast(null);
        linkedList.addLast(pRoot);
        boolean right2Left = true;
        //至少有两个元素正常情况下
        while (linkedList.size() != 1){
            TreeNode treeNode = linkedList.removeFirst();
            if(treeNode == null){
                Iterator<TreeNode> iterator = null;
                if(right2Left){
                    iterator = linkedList.iterator();
                }else {
                    iterator = linkedList.descendingIterator();
                }
                right2Left = !right2Left;
                while (iterator.hasNext()){
                    TreeNode next = iterator.next();
                    list1.add(next.val);
                }
                list.add(new ArrayList<Integer>(list1));
                //list.add(new ArrayList<>(linkedList));
                list1.clear();
                linkedList.addLast(null);
                continue;
            }
            if(treeNode.left != null){
                linkedList.addLast(treeNode.left);
            }
            if(treeNode.right != null){
                linkedList.addLast(treeNode.right);
            }
        }
        return list;
    }
}
