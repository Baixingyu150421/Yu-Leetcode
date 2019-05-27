package newcode;

import java.util.*;

public class KthNode {
    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        PriorityQueue<Integer> list = midOrder(pRoot);
        //Integer integer = list.
       // return new TreeNode(integer);
        return null;
    }
    PriorityQueue<Integer> midOrder(TreeNode  root){
        if(root == null) return null;
        //二叉搜索树的中序遍历结果是按升序排列的
        PriorityQueue<Integer> queue = new PriorityQueue<>(new minQueue());
        midOrder(root.left);
        queue.add(root.val);
        midOrder(root.right);
        return queue;
    }
    class minQueue  implements Comparator<Integer>{
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 - o2 ;
        }
    }

}
