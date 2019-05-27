package newcode;


public class isSymmetrical {
     class TreeNode {
         int val = 0;
         TreeNode left = null;
         TreeNode right = null;

         public TreeNode(int val) {
             this.val = val;

         }
     }
    boolean isSymmetrical(TreeNode pRoot)
    {
            return same( pRoot ,  pRoot);
    }
    public boolean same(TreeNode t1,TreeNode t2){
        if(t1 == null && t2 == null) return true;
        if(t1 == null || t2 == null) return false;
        return t1.val == t2.val && same(t1.left,t2.right) && same(t1.right,t2.left);
    }
}
