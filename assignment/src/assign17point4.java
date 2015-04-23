/**
 * Created by steven on 4/12/15.
 */
public class assign17point4 {
    static int findMaxNoIf(int a, int b){
        int m;
        m = sign(a) - sign(b);

        return (sign(a) * a + sign(b) * b)*(m & 0x1) + (~m & 0x1) *(sign(a-b)*a + (~sign(a-b))*b);
    }

    private static int sign(int n){
        return n>>31 & 0x1;
    }
}
