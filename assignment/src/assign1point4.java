/**
 * Created by steven on 1/14/15.
 */

/*Write a method to replace all spaces in a string with '%20'.
You may assume that the string has sufficient space at the end
of the string to hold the additional characters, and that you
are given the "true" length of the string. (Note: if implementing
in Java, please use a character array so that you can perform this operation inplace.)
*
* */
public class assign1point4 {
    public static void main(String[] args){
        String t1 = "ab cd ef      ";
        String t2 = t1.trim();
        char[] t3 = t1.toCharArray();
        //System.out.println(t2);

        //String t4 = new String();
        int length = t2.length();
        System.out.println(length);
        assign1point4 test = new assign1point4();
        //test.replacespace1(t3,length);
        System.out.println(test.replacespace1(t3,length));
        //for(int i=0; i > result.length; i++){
          //  t4.
        //}
        //System.out.println(result + " sd");
    }

    public static void replacespace(char[] arg, int lengt){
        int space = 0;
        for(int i = 0; i < lengt; i++){
            if(arg[i] == ' '){          //count how many space need to replace
                space++;
            }
        }
        int newlength = lengt-1 + space *2;//total length for the new string

        for(int i = lengt-1; i >= 0; i--){//construct the new string from the end
            if(arg[i] == ' '){
                arg[newlength] = '0';
                arg[newlength -1] = '2';
                arg[newlength -2] = '%';
                newlength = newlength -3;
            }
            else{
                arg[newlength] = arg[i];
                newlength--;
            }
        }
        String new1 = new String(arg);
        System.out.println(new1);
    }


    public static String replacespace1(char[] arg, int length){
        int space = 0;
        for(int i = 0; i < length; i++){
            if(arg[i] == ' '){
                space++;
            }
        }
        for(int i = length-1; i >= 0; i--){
            if(arg[i] == ' '){
                arg[i + space *2] = '0';
                arg[i + space *2 -1] = '2';
                arg[i + space *2 -2] = '%';
                space = space -1;
            }
            else{
                arg[i +space *2] = arg[i];
            }
        }
        String new2 = new String(arg);
        return new2;
    }
}
