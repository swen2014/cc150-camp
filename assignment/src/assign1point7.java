/**
 * Created by steven on 1/18/15.
 */
public class assign1point7 {
    public static void main(String[] args){
        int test[][] =  {{1,2,3,4},{5,0,7,8},{9,10,11,12},{13,14,15,16}};
        //int test[][] ={{1,0,3},{4,5,6},{7,8,9}};
        Setzero(test);
        System.out.println("test");
        int length = test.length;
        for(int i=0; i<length;i++)
            for(int j=0; j<test[0].length; j++)
                System.out.print(i + ":" + j + "{" +test[i][j] + "}"+ " ");
    }

    public static void Setzero(int[][] args){

        int row = args.length;
        int column = args[0].length;
        boolean r[] = new boolean[row];
        boolean c[] = new boolean[column];//default false
        for(int i=0; i<row; i++)
            for(int j=0; j<column; j++)
                if(args[i][j] == 0){
                    r[i] = true;
                    c[j] = true;
                }

        for(int i=0; i<row; i++)
            if(r[i] == true) {
                for (int j = 0; j < column; j++){
                    args[i][j] =0;
                }
            }
        for(int j=0; j<column; j++)
            if(c[j] == true) {
                for (int i = 0; i <row; i++){
                    args[i][j] =0;
                }
            }
    }
}
