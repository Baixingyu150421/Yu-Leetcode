import java.util.ArrayList;
import java.util.List;

public class postorderTraversal_0145 {
    /**
     * 二叉树的后序遍历 ，输入有null的情况
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Recursive(list,root);
        return list;
    }

    public void Recursive (List<Integer> list ,TreeNode root ){
        if(root == null) return ;
        Recursive(list,root.left);
        Recursive(list,root.right);
        list.add(root.val);
    }
}
