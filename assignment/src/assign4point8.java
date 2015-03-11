/**
 * Created by steven on 2/4/15.
 */
public class assign4point8 {
    public boolean isSubtree(TreeNode t1, TreeNode t2){
        if (t2 == null)
            return true;
        if (t1 ==null)
            return false;
        if (sameT(t1, t2))
            return true;
        return isSubtree(t1.left,t2) || isSubtree(t1.right,t2);
    }

    static boolean sameT(TreeNode t1, TreeNode t2){
        if (t1 == null && t2 == null)
            return true;

        if (t1.value ==t2.value)
            return sameT(t1.left,t2.left) && sameT(t1.right,t2.right);
        return false;
    }
}
