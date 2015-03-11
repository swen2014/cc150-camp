/**
 * Created by steven on 2/11/15.
 */
public class assign5point6 {
    public  static int swapInt(int a){
        return (a & 0xAAAAAAAA)>>1 | (a & 0x55555555)<<1;
    }
}
