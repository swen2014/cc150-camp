import java.util.ArrayList;
import java.util.List;

/**
 * Created by steven on 3/14/15.
 */
public class assign9point9 {

    public List<int[]> nQueen(int n){
        int[] board = new int[n];
        ArrayList<int[]> ans = new ArrayList<int[]>();
        nQueen(0,board,ans);
        return ans;
    }

    private static void nQueen(int row, int[] board, ArrayList<int[]> ans){
        if (row == board.length){
//            int[] o = board.clone();
            ans.add(board.clone());
        }else {
            for (int i=0;i< board.length;i++){
                board[row] = i;
                if (isQueenSafe(row,board)){
                    nQueen(row+1, board, ans);
//                    board[row] = -1;
                }
            }
        }
    }

    private static boolean isQueenSafe(int row, int[] board){
        for (int i=0; i<row; i++){
            if (board[i] == board[row] || Math.abs(board[i] - board[row]) == row - i){
                return false;    //(r1, c1) - (r2, c1). if |r1-r2| == |c1-c2| then they are in diagonal
            }
        }
        return true;
    }
}
