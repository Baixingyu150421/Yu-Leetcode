public class isSymmetric_101 {
    //判断一个二叉树是否是对称的
    public boolean isSymmetric(TreeNode root) {
        return ismirror(root,root);
    }
    //递归
    public static boolean ismirror(TreeNode isleft , TreeNode isright ){
        if(isleft == null && isright == null) return true;
        if(isleft == null || isright == null) return false;
        return (isleft.val == isright.val)
                && ismirror(isleft.left,isright.right)
                && ismirror(isleft.right,isright.left);
    }
}
