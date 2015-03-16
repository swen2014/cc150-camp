/**
 * Created by steven on 3/14/15.
 */
public class assign9point7 {

    enum Color{
        Yellow, Green, Red, White, Black
    }
    public static void fillColor(Color[][] arr, int x, int y, Color origin, Color fresh){
        if (x < 0 || x > arr[0].length || y < 0 || y > arr.length)
        if (arr[x][y] != origin){
            return;
        }else {
            arr[y][x] = fresh;
            fillColor(arr, x, y+1, origin, fresh);
            fillColor(arr, x, y-1, origin, fresh);
            fillColor(arr, x+1, y, origin, fresh);
            fillColor(arr, x-1, y, origin, fresh);
        }
    }
}
