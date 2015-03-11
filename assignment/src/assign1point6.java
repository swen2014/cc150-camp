/**
 * Created by steven on 1/18/15.
 */
public class assign1point6 {
    public static void main(String[] args){
        //int test[][] =  {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int test[][] ={{1,2,3},{4,5,6},{7,8,9}};
        Rotation(test);
        System.out.println("test");
        int length = test.length;
        for(int i=0; i<length;i++)
            for(int j=0; j<length; j++)
                System.out.print(i + ":" + j + "{" +test[i][j] + "}"+ " ");
    }
    public static void Rotation(int[][] args) {
        int row = args.length;
        int temp;
        for (int i = 0; i < row / 2; i++) {//rotate half level is enough
            for (int pointer = i; pointer < row-1-i; pointer++) {// move the elements without the last
                temp = args[i][pointer];
                args[i][pointer] = args[row - 1 - pointer][i];

                args[row - 1 - pointer][i] = args[row - 1 - i][row - 1 - pointer];

                args[row - 1 - i][row - 1 - pointer] = args[pointer][row - 1 - i];

                args[pointer][row - 1 - i] = temp;
            }

        }
    }
    /*Given an image represented by an NxN matrix, where each pixel in the image is 4
bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
    *           (i,j)       (j,row-1-i)
    *
    *
    *           (row-1-j,i)          (row-1-i,row-1-j)
    *
    * */
}

