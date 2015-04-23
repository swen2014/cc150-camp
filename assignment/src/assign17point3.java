/**
 * Created by steven on 4/12/15.
 */
public class assign17point3 {

    static int trailingZero(int n){
        if (n<5){
            return 0;
        }
        int two=0, five=0;
        for (int i=n; i>1; i--){
            five += findFive(i);
//            two += findTwo(i);
        }
//        return two<=five? two:five;
        return five;
    }

    static int findFive(int n){
        if (n < 5)
            return 0;
        int count = 0;
        while (n%5 == 0){
            n = n/5;
            count++;
        }
        return count;
    }

    static int findTwo(int n){
        if (n < 2)
            return 0;
        int count = 0;
        while (n%2 == 0){
            n = n/2;
            count++;
        }
        return count;
    }
}
