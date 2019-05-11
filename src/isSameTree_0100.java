public class isSameTree_0100 {
    /**
     * 递归
     * @param p
     * @param q
     * @return
     */
    public boolean isSameTree2(TreeNode p, TreeNode q){
        if(p == null && q == null) return true;
        if(p != null && q != null && p.val == q.val ){
            return  isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }
        return  false;
    }

    /**
     * 先序 序列化二叉树
     * @param p
     * @param q
     * @return
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        String s1 = serializedBinaryTree(p);
        String s2 = serializedBinaryTree(q);
        if(s1.equals(s2)){
            return true;
        }
        return false;
    }
    public static String serializedBinaryTree(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        if (root ==  null){
            sb.append("##");
            return sb.toString();
        }
        return  sb.append(root.val) + serializedBinaryTree(root.left)+ serializedBinaryTree(root.right);
    }
}
