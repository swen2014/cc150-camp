import java.util.Stack;

/**
 * Created by steven on 1/28/15.
 */

/*
*
* 3.4 hanoi
* */
public class assign3point3{

    public static void main(String[] arg){
        int n = 3;
        Tower[] towers = new Tower[n];
        for (int i=0; i < 3; i++){
            towers[i]= new Tower(i);
        }
        for (int i =9; i>0; i--){
            towers[0].addPlate(i);
        }
        towers[0].Hanoi(9,towers[2],towers[1]);

        for (int i =9; i>0; i--){
            System.out.println(towers[2].pop());
        }
    }

    public static class Tower{ // build tower location
        private Stack<Integer> tower;
        private int indx;

        public Tower(int a){
            tower = new Stack<Integer>();
            indx = a;
        }

        public int pop(){
            int res = tower.pop();
            return res;
        }
//
//        public int getIndx(){
//            return indx;
//        }

        public void addPlate(int a){
            int top = tower.peek();
            if (top < a){
                tower.push(a);
            }
            else {
                System.out.println("Move plate fault"+ a);
            }
        }


        public void movePlate(Tower destination){
            int last = tower.pop();
            destination.addPlate(last);
        }

        public void Hanoi(int a, Tower destination, Tower cache){
            if ( a > 0) {
                Hanoi(a - 1, cache, destination);
                movePlate(destination);
                cache.Hanoi(a - 1, destination, this);
            }
            else{
                //movePlate(1,);
            }
        }

    }



}
