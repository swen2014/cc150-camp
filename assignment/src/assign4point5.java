
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

    public boolean isValidBST(TreeNode root) {
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean isBST(TreeNode node, int low, int high){
        if(node == null)
            return true;

        if(low < node.value && node.value < high)
            return isBST(node.left, low, node.value) && isBST(node.right, node.value, high);
        else
            return false;
    }

}
