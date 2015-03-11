/**
 * Created by steven on 2/4/15.
 */
public class assign4point9 {
    public void findSum(TreeNode root, int sum){
        store(root, sum, new int[getHeight(root)], 0);
    }

    private static void store(TreeNode n, int sum, int[] path, int height){
        if (n == null)
            return;
        path[height] = n.value;

        int a=0;
        for (int i=height; i>=0; i-- ){
            a += path[i];
            if (a == sum)
                printpath(path,i,height);
        }

        store(n.left,sum,path,height +1);
        store(n.right,sum,path,height +1);
    }

    private static int getHeight(TreeNode n) {
        if (n == null) return 0;
        return Math.max(getHeight(n.left), getHeight(n.right)) + 1;
    }

    static void printpath(int[] path, int start, int end){
        for (int i = start; i <= end; ++i) {
            System.out.print(path[i] + " ");
        }
    }
}
