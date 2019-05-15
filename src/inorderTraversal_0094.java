import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的中序遍历，输入有null的情况
 */
public class inorderTraversal_0094 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Recursive(list,root);
        return list;
    }

    public void Recursive (List<Integer> list ,TreeNode root ){
        if(root == null) return ;
        Recursive(list,root.left);
        list.add(root.val);
        Recursive(list,root.right);
    }
}
