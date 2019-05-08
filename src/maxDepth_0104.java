
//Definition for a binary tree node.
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

/**
 * 2019-05-08
 */
public class maxDepth_0104 {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return Math.max(1 + maxDepth(root.left),1 + maxDepth(root.right));
    }
}
