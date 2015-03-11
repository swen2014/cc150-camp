/**
 * Created by steven on 2/6/15.
 */
public class assign5point1 {

    private static int insertMN(int m, int n, int i, int j){
        int mask = ~0;
        mask = ((~(mask << (j+1)))>>> i)<<i;
        System.out.println(Integer.toBinaryString(mask)+"mask");
        //System.out.println(Integer.toBinaryString(n)+"n");

        int a = m <<i;
        System.out.println(Integer.toBinaryString(a)+"a");

        int res = (mask) & a;
        System.out.println(Integer.toBinaryString(res)+ "res");
        int res1 = (~mask) & n;

        System.out.println(Integer.toBinaryString(res1) + "res1" );
        return res | res1;

    }
}
