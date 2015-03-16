import java.util.ArrayList;

/**
 * Created by steven on 3/12/15.
 *
 * Implement an algorithm to print all valid (e.g., properly opened and closed) combinations of n-pairs of parentheses.
 EXAMPLE
 Input: 3
 Output: ((())), (()()), (())(), ()(()), ()()()
 */
//
public class assign9point6 {
    public static ArrayList<String> generateParenthesis(int n) {
        ArrayList<String> list = new ArrayList<String>();
        rec(n, 0, 0, "", list);
        return list;
    }

    public static void rec(int n, int left, int right, String s, ArrayList<String> list){
        // invariant必须满足左括号数目要大等于右括号数目
        if(left < right){
            return;
        }

        // 如果左右括号数目相等则添加到list
        if(left==n && right==n){
            list.add(s);
            return;
        }

        // 左括号已满，只能添加右括号
        if(left == n){
            rec(n, left, right+1, s+")", list);
            return;
        }

        rec(n, left+1, right, s+"(", list);		// 继续添加左括号
        rec(n, left, right+1, s+")", list);		// 继续添加右括号
    }
}
