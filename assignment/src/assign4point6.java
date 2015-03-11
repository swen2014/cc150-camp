/**
 * Created by steven on 2/4/15.
 */
public class assign4point6 {
    /*                  F
    *           /             \
    *          B              H
    *       /     \          / \
    *      A       D        G   I
    *             / \
    *            C   E
    * */
    public assign4point5.TreeNode findNext(assign4point5.TreeNode n){
        if (n == null){
            return null;
        }
        if(n.right !=null){
            return leftmostchild(n.right);//
        }
        else{
            while (n.parent!= null && n.parent.right == n){
                n = n.parent;
            }
            return n.parent;
        }
    }

    public assign4point5.TreeNode leftmostchild(assign4point5.TreeNode n){
//        if (n == null)
//            return null;
        if (n.left == null)
            return n;
        return leftmostchild(n.left);
    }
}
