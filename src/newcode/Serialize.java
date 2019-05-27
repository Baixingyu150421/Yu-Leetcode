package newcode;

public class Serialize {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    int index = -1;
    //先序遍历
    String Serialize(TreeNode root) {
       StringBuilder stringBuilder = new StringBuilder();
       if(root == null) {
           stringBuilder.append("#,");
           return stringBuilder.toString();
       }
       stringBuilder.append(root.val + ",");
       stringBuilder.append(Serialize(root.left));
       stringBuilder.append(Serialize(root.right));
       return stringBuilder.toString();
    }
    TreeNode Deserialize(String str) {
        index++;
        String [] s = str.split(",");
        TreeNode node = null;
        while (s[index].charAt(0) != '#'){
            node = new TreeNode(Integer.parseInt(s[index]));
            node.left = Deserialize(str);
            node.right = Deserialize(str);
        }
        return node;
    }
}
