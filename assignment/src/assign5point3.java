/**
 * Created by steven on 2/7/15.
 */
public class assign5point3 {

    static class number{
        int anInt;
        int count1;
        int count0;
    }

    public static void getBinary(number a){
        a.count1 = 0;
        a.count0 = 0;
        int i = a.anInt;
        while(i != 0){
            if ((i & 1) == 1){
                a.count1++;
            }
            else {
                a.count0++;
            }
            i >>= 1;
        }
    }

    public static void printNextsmall(number a){
        getBinary(a);
        int c0 = a.count0,c1=a.count1;
        number b = a;
//        System.out.println("number a"+a.anInt +":" + a.count0 + ":" + a.count1);
        //getBinary(b);
        while (b.anInt > 0){
            b.anInt -= 1;
            getBinary(b);
//            System.out.println(b.anInt + ":" +b.count0+":"+b.count1);
            if ((b.count0 == c0) && (b.count1 == c1)){
                System.out.println(b.anInt +" next small "+ Integer.toBinaryString(b.anInt));
                return;
            }
        }
        System.out.println("No next small found");
    }

    public static void printNextbig(number a){
        getBinary(a);
        int c0 = a.count0,c1=a.count1;
        number b =a;
//        getBinary(b);
//        System.out.println(a.anInt +":" + a.count0 + ":" + a.count1);
        while (b.anInt > 0 ){
            b.anInt += 1;
            getBinary(b);
            if (b.count0 == c0 && b.count1 == c1){
                System.out.println(b.anInt+" next big "+ Integer.toBinaryString(b.anInt));
                return;
            }
            if (b.anInt > Math.pow(2,32)){
                break;
            }
        }
        System.out.println("No next big found");
    }

}
