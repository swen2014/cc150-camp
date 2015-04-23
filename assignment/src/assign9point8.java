/**
 * Created by steven on 3/14/15.
 */
public class assign9point8 {
    static int getNumRepresentations(int n, int coin) {
        if (n < 0) return 0;
        if (n == 0) return 1;
        int sum = 0;
        switch (coin) { //XXX: note that there is no "break"s in-between
            case 25: sum += getNumRepresentations(n - 25, 25);
            case 10: sum += getNumRepresentations(n - 10, 10);
            case 5: sum += getNumRepresentations(n - 5, 5);
            case 1: sum += getNumRepresentations(n - 1, 1);
        }
        return sum;
    }
}
