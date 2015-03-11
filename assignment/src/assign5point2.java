/**
 * Created by steven on 2/7/15.
 */
public class assign5point2 {
    public static void decimalBinary(double a){
//        int in = a.intValue();
//        System.out.println(in);
        if (a <= 0 || a >= 1) System.out.println("ERROR");

        StringBuilder res = new StringBuilder("0.");
        while (a > 0) {
            a = a * 2;
            if (a >= 1.0){
                res.append(1);
                a -=1;
            }
            else{
                res.append(0);
            }
        }
        if (res.length() > 32){
            System.out.println("ERROR");
        }
        else{
            String p = res.toString();
            System.out.println(p);
        }
    }
}
