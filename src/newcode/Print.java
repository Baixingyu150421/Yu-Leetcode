package newcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Print {
     class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;

        }
    }
    //二叉树的层次遍历
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(pRoot == null) return res;
        ArrayList<Integer> list = null;
        //使用队列
        Queue<TreeNode> treeNodes = new LinkedList<>();
        //先添加头结点
        treeNodes.add(pRoot);
        //int i = 0;
        while (!treeNodes.isEmpty()) {
            int count = treeNodes.size();
            while (count > 0) {
                list = new ArrayList<>();
                TreeNode node = treeNodes.poll();
                list.add(node.val);
                //左边
                if (node.left != null) {
                    treeNodes.add(node.left);
                }
                //右边
                if (node.right != null) {
                    treeNodes.add(node.right);
                }
                //每次取一个
                count --;
            }
            //按层添加
            res.add(list);
        }
        return res;
      }
}
