/**
 * Created by steven on 2/4/15.
 */
public class assign4point7 {

    public static TreeNode find1stAncestor(TreeNode root, TreeNode a, TreeNode b){
        if (root == null || a ==null|| b==null)
            return null;
        if (root ==a || root ==b)
            return root;
        boolean ainleft = contain(a,root.left);
        boolean binleft = contain(b,root.left);

        if (ainleft != binleft)
            return root;
        if (ainleft && binleft)
            return find1stAncestor(root.left,a,b);
        if (!(ainleft||binleft))
            return find1stAncestor(root.right,a,b);
        else
            return null;

    }

    private static boolean contain(TreeNode a, TreeNode root){
        if (root ==null)
            return false;
        if (a == root)
            return true;
        return contain(a,root.left)||contain(a,root.right);
    }
}
