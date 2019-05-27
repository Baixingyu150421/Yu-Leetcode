package newcode;
//平衡二叉树的左右子树的高度差不大于1
public class IsBalanced_Solution {
    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    //定义自己的数据结构 面向对象的思想
    private class TreeReturn{
        boolean flag;
        int depth;
        public TreeReturn(int depth, boolean flag){
            this.flag = flag;
            this.depth = depth;
        }
    }
    public boolean IsBalanced_Solution(TreeNode root) {
        return isBalance(root).flag;
    }
    public TreeReturn isBalance(TreeNode root){
        //递归终止条件  空树是平衡的
        if(root == null){
            return new TreeReturn(0,true);
        }
        //计算左树的高度
        TreeReturn left = isBalance(root.left);
        //计算右树的高度
        TreeReturn right = isBalance(root.right);
        //非平衡的条件
        if(left.flag == false || right.flag == false ){
            return new TreeReturn(0,false);
        }
        if(Math.abs(left.depth - right.depth) > 1){
            return new TreeReturn(0,false);
        }
        //是平衡的最终返回
        return new TreeReturn(Math.max(left.depth,right.depth)+1,true);
    }
}
