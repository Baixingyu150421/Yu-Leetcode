package newcode;
//给出前序和中序重构出这颗二叉树
public class reConstructBinaryTree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root = reConstructBinaryTreeCore(pre, 0, pre.length - 1, in, 0, in.length - 1);
        return root;
    }

    public TreeNode reConstructBinaryTreeCore(int [] pre,int startPre , int endPre , int [] in , int startIn , int endIn){
        //base case  左右可能建完了
        if(startPre >  endPre ||  startIn > endIn){
            return null;
        }
        TreeNode root = new TreeNode(pre[startPre]);
        for(int j = startIn ; j <= endIn ;j++ ){
            if(in[j] == pre[startPre]){
                //划分出左右子树咋前序遍历和中序遍历数组中的区间范围
                root.left = reConstructBinaryTreeCore(pre, startPre + 1, j + startPre - startIn, in, startIn, j - 1);
                root.right = reConstructBinaryTreeCore(pre, startPre + j - startIn + 1, endPre, in, j + 1, endIn);
                break;
            }
        }
        return root;
    }
}
