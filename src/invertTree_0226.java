public class invertTree_0226 {
    //翻转二叉树 递归实现
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode temp = root.left;
        root.left  = invertTree(root.right);
        root.right = invertTree(temp);
        return root;
    }
}
