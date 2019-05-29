package newcode;

import java.util.ArrayList;
import java.util.List;

public class Convert {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    //二叉树转双向链表

    List<TreeNode> list = new ArrayList<>();
    public TreeNode Convert(TreeNode pRootOfTree) {
        List<TreeNode> list = InOrder(pRootOfTree);
        if(list == null) return null;
        int i = 1;
        for(;i<list.size();i++){
            //???  这样调整就是双向链表了？
            list.get(i-1).right=list.get(i);
            list.get(i).left=list.get(i-1);
        }
        //设置最后一个节点的后继为null
        list.get(i-1).right=null;
        //返回头结点
        return list.get(0);
    }
    public List<TreeNode> InOrder(TreeNode root){
        if(root == null) return null;
        InOrder(root.left);
        list.add(root);
        InOrder(root.right);
        return list;
    }

}
