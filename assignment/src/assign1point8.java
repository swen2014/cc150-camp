/**
 * Created by steven on 1/16/15.
 */
public class assign1point8 {
    public void main(String[] args) {
        String origin = "waterproof";
        String rotated = "erproofwat";
        assign1point8 test = new assign1point8();
        Boolean result = test.rotacontain(origin, rotated);
        System.out.print(result);
    }

    public Boolean rotacontain(String arg1, String arg2){
        if(arg1.length() ==arg2.length() && arg1.length() != 0) {
            StringBuffer s1 = new StringBuffer(arg1 + arg1);

            return isSubstring(s1.toString(), arg2);
        }
        return false;
    }

    private static Boolean isSubstring(String str1, String str2){
        return false;
    }

}
