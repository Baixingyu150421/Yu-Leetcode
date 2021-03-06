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
                flag = diGui(root1,root2);
            }
            if(!flag){
                flag = HasSubtree(root1.left,root2);
            }
            if(!flag){
                flag = HasSubtree(root1.right,root2);
            }
        }
        return flag;
    }
    boolean  diGui(TreeNode t1 , TreeNode t2){
        if(t1 == null && t2 != null) return false;
        if(t2 == null) return true;
        if(t1.val != t2.val) return false;
        return diGui(t1.left,t2.left) && diGui(t1.right,t2.right);
    }

//    public boolean HasSubtree2(TreeNode root1,TreeNode root2) {
//        if(root1 == null || root2 == null) return false;
//        StringBuilder stringBuilder1 = preOrderTree(root1);
//        StringBuilder stringBuilder2 = preOrderTree(root2);
//        if(stringBuilder1.toString().contains(stringBuilder2.toString())){
//            return true;
//        }
//        return false;
//    }
//    StringBuilder  sb = new StringBuilder();
//    public StringBuilder preOrderTree(TreeNode  root){
//        if(root == null) return sb;
//        sb.append(root.val);
//        preOrderTree(root.left);
//        preOrderTree(root.right);
//        return sb;
//    }
}
