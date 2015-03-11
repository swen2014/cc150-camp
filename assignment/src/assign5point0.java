/**
 * Created by steven on 2/4/15.
 */
public class assign5point0 {
    // Reverse bit in unsigned number

    public static void main(String[] args){
        int a = 178;
        a = a ^ 0xff;
        System.out.println(a + " reverse");
    }
    public static void main1(String[] args){
        int a = 178;
        int b = 0;
        int c =a ^ 0xff;
        while (a!=0){
            b<<=1;
            b|=( a &1);
            a>>=1;

        }
        System.out.println(b);
        System.out.println(c + " reverse");
    }

}
