/**
 * Created by steven on 3/29/15.
 */
public class assign11point8 {

    private static NodeWithRank root = null;

    static void insert(int v, NodeWithRank root) {
        NodeWithRank newNode = new NodeWithRank(v);
        if (root == null) root = newNode;
        else if (v > root.value) {
            if (root.right == null)
                root.right = newNode;
            else
                insert(v, root.right);
        } else {
            ++root.leftSize;
            if (root.left == null)
                root.left = newNode;
            else
                insert(v, root.left);
        }
    }

    static int getRank(int v, NodeWithRank root) {
        if (root == null) return -1;
        if (v == root.value) {
            return root.leftSize;
        } else if (v > root.value) {
            int rightRank = getRank(v, root.right);
            return rightRank == -1 ? -1 : root.leftSize + 1 + rightRank;
        } else {
            int leftRank = getRank(v, root.left);
            return leftRank == -1 ? -1 : leftRank;
        }
    }

    static int getRankOfNumber(int x) {
        if (root == null) return -1;
        return getRank(x, root);
    }

    static void track(int x) {
        if (root == null) root = new NodeWithRank(x);
        else insert(x, root);
    }
}
    class NodeWithRank{
        int value;
        int leftSize;
        NodeWithRank left;
        NodeWithRank right;

        NodeWithRank(int x){
            value = x;
        }
    }

