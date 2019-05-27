package newcode;

public class HasSubtree {
    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean flag = false;
        if(root1 != null && root2 != null){
            if(root1.val == root2.val){
                return diGui(root1,root2);
            }
            if(!flag){
                HasSubtree(root1.left,root2);
            }
            if(!flag){
                HasSubtree(root1.right,root2);
            }
        }
        return flag;
    }
    boolean  diGui(TreeNode t1 , TreeNode t2){
        //t2更大
        if(t1 == null && t2 != null) return false;
        //t2已经遍历完了
        if(t2 == null) return true;
        if(t1.val != t2.val) return false;
        return diGui(t1.left,t2.left) && diGui(t1.right,t2.right);
    }
}
