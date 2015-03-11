import javax.swing.tree.TreeNode;

/**
 * Created by steven on 2/4/15.
 */
public class assign4point5 {
    public boolean isBST( TreeNode n){
        if(n == null)
           return false;
        else{
            return isBST(n.left)&&isBST(n.right) && isright(n.right,n)&& isleft(n.left,n);
        }
    }

    public boolean isleft(TreeNode a, TreeNode b){
        if ( a == null)
            return false;
        return a.value <= b.value && isleft(a.left,b) && isleft(a.right,b);
    }

    public boolean isright(TreeNode a, TreeNode b){
        if ( a == null)
            return false;
        return a.value > b.value && isright(a.left,b) && isright(a.right,b);
    }


    public class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;
        TreeNode parent; /* only used for certain cases */

        public TreeNode(int x) {
            value = x;
        }

    }
}
