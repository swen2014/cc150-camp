import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by steven on 2/11/15.
 */
public class assign5point7 {
//    public static int findMiss(int[] a, int n){
//        int l = getBlength(n);
//        int LSB;
//        int count0 = 0;
//        int count1 = 0;
//            for (int j =0; j<a.length;j++){
//                if((a[j] &1) == 0){
//                    count0++;}
//                else{count1++;}
//            }
//        if (count0 == count1){
//
//        }
//
//
//    }

    public static int getBlength(int a){
        int count = 0;
        while (a !=0){
            a >>=1;
            count++;
        }
        return count;
    }



    /* int visited each time n, n/2, n/4 ...1 , log(n) times in total */
    public static int findMissingInt(ArrayList<Integer> A) {
		/* calculate number of bits */
        double log = Math.log(A.size() + 1) / Math.log(2);
        int bitNum = (log - (int) log > 0.0) ? (int) log + 1 : (int) log;

        return findMissingInt(A, 0, bitNum);
    }

    private static int findMissingInt(ArrayList<Integer> A, int colum, int bitNum) {

        if (colum >= bitNum) {
            return 0;
        }

        ArrayList<Integer> zeroBits = new ArrayList<Integer>();
        ArrayList<Integer> oneBits = new ArrayList<Integer>();

        for (int i = 0; i < A.size(); ++i) {
            if (getBit(A.get(i), colum) == 0) {
                zeroBits.add(A.get(i));
            } else {
                oneBits.add(A.get(i));
            }
        }

        if (zeroBits.size() <= oneBits.size()) {
            int v = findMissingInt(zeroBits, colum + 1, bitNum);
            return (v << 1) | 0;
        } else {
            int v = findMissingInt(oneBits, colum + 1, bitNum);
            return (v << 1) | 1;
        }
    }

    private static int getBit(int num, int j) {
        return num & (1 << j);
    }
}
