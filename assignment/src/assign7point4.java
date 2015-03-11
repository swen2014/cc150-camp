/**
 * Created by steven on 2/21/15.
 */
public class assign7point4 {

    public static int multiply(int a, int b){
        if (a > b){
            return multiply(b,a);
        }
        int ans = 0;
        for (int i=0; i<b;i++){
            ans += a;
        }
        return ans;
    }
    public static int subTract(int a, int b){
        return a + negative(b);
    }
    public static int negative(int a){
        int ans =0;
        if (a>0){
            while(a !=0){
                a--;
                ans--;
            }
        }else{
            while (a !=0){
                a++;
                ans++;
            }
        }
        return ans;
    }

    public static int divide(int a, int b) throws Exception {
        if (b==0)
            throw new Exception();
        if (a < b){
            return 0;
        }
        int ans = 0;
        int sign = 0;
        if (a < 0){
            sign = ~sign;
            a = negative(a);
        }
        if (b < 0){
            sign =~sign;
            b=negative(b);
        }
        while (a > b){
            ans++;
            a -= b;
        }
        if (sign == 0){
            return ans;
        }else {
            return negative(ans);
        }

    }
}

