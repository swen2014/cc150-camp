import java.util.ArrayList;

/**
 * Created by steven on 4/14/15.
 */
public class ConstructMinCostBST {
//    public class OptimalSearchTree {
    class Tree{
    Tree left;
    Tree right;
    int cost;
    int val;
    public Tree(int x, int y){
        val = x;
        cost = y;
    }
}

        public static int sum(int freq[], int i, int j) {
            int s = 0;
            for (int k = i; k <= j; k++)
                s += freq[k];
            return s;
        }

    public Tree optCost(int[] key, int freq[], int i, int j) {
        if (i > j)
            return null;
        if (i == j) {
            Tree root = new Tree(key[i],freq[i]);
            return root;
        }
        //计算fsum的原因是：左右子树的高度比当前节点高度大1，因此要对所有节点重复加一次
        int fsum = sum(freq, i, j);
        int min = Integer.MAX_VALUE;
        Tree dump = new Tree(-1,-1);
        // 逐个考虑每个顶点为根的情况
        for (int r = i; r <= j; ++r) {
            Tree root = new Tree(key[r],freq[r]);
            Tree left = optCost(key,freq, i, r - 1);
            Tree right = optCost(key, freq, r + 1, j);
            int lc;
            int rc;
            if (left == null)
                lc = 0;
            else
                lc = left.cost;
            if (right == null)
                rc = 0;
            else
                rc = right.cost;

            int cost = lc + rc;
            if (cost < min){
                min = cost;
                root.left = left;
                root.right = right;
                dump = root;
            }

        }
        dump.cost = min+ fsum;
        return dump;
    }
        public static void main(String[] args) {
            int freq[] = {34, 8, 50};
            int[] key = {10, 12, 20};
            ConstructMinCostBST main = new ConstructMinCostBST();
            System.out.println("Cost of Optimal BST is " + main.optCost(key, freq, 0, freq.length - 1).cost);
        }


    //   My solution to return the minimum cost and Tree Structure
    public Tree optCostDP(int freq[], int[] key) {
        int n = freq.length;
        Tree[][] dp = new Tree[n][n];
        for (int i = 0; i < n; i++)
            dp[i][i] = new Tree(key[i], freq[i]);
        // l stands for the
        for (int l = 2; l <= n; l++) {
            for (int i = 0; i <= n - l; i++) {
                //
                int j = i + l - 1;
                dp[i][j] = new Tree(key[j], Integer.MAX_VALUE);
                for (int r = i; r <= j; r++) {
                    int c = ((r > i) ? dp[i][r - 1].cost : 0)
                            + ((r < j) ? dp[r + 1][j].cost : 0) + sum(freq, i, j);
                    if (c < dp[i][j].cost) {
                        dp[i][j] = new Tree(key[r], c);
                        dp[i][j].left = ((r > i) ? dp[i][r - 1] : null);
                        dp[i][j].right = ((r < j) ? dp[r + 1][j] : null);
                    }
                }
            }
        }
        return dp[0][n - 1];
    }
}
