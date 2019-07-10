package newcode;

import java.util.*;

public class Print {
     class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;

        }
    }
    public ArrayList<ArrayList<Integer>> Print2(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        boolean reverse = false;
        while (!queue.isEmpty()){
            int count = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            while (count-- > 0){
                TreeNode node = queue.poll();
                if(node == null) continue;
                list.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
            }
            if (reverse){
                Collections.reverse(list);
            }
            reverse = !reverse;
            if(list.size() != 0){
                result.add(list);
            }
        }
        return result;
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
