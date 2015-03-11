/**
 * Created by steven on 2/11/15.
 */
public class assign5point5 {

    public static int flipInt(int a, int b){
        int result = a ^b;
        int count = 0;
        int temp;
        while(result != 0){
            temp = result & 1;
            if(temp == 1){
                count++;
            }
            result >>= 1;
        }
        return count;
    }
}
