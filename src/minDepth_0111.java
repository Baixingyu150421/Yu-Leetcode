public class minDepth_0111 {
    public static void main(String[] args) {

    }
    //二叉树的最小深度
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        else if(root.left == null && root.right == null) return 1;
        else if(root.left == null) return 1 + minDepth(root.right);
        else if(root.right == null) return 1 + minDepth(root.left);
        //左右都不为空
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
