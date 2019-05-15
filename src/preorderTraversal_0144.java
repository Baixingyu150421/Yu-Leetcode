import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的前序遍历，输入有null
 */
public class preorderTraversal_0144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Recursive(list,root);
        return list;
    }

    public void Recursive (List<Integer> list ,TreeNode root ){
        if(root == null) return ;
        list.add(root.val);
        Recursive(list,root.left);
        Recursive(list,root.right);
    }
}
