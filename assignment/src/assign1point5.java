/**
 * Created by steven on 2/24/15.
 */

/*Implement a method to perform basic string compression using the counts
of repeated characters. For example, the string a a b c c c c c a a a would
become a2blc5a3. If the "compressed" string would not become smaller than
the original string, your method should return the original string.*/
public class assign1point5 {
    public static void main(String[] args){
        String  a ="aabcccccaaa";
        System.out.println(stringCompression(a));
    }
    public static String stringCompression(String a){
        StringBuilder res =new StringBuilder();
        char tmp = a.charAt(0);
        int count=1;
        for(int i=1; i<a.length(); i++){
            if(a.charAt(i)!=tmp){
                res.append(tmp);
                res.append(count);
                tmp = a.charAt(i);
                count =1;
            }else {
                count++;
            }
        }
        res.append(tmp);
        res.append(count);
        if (res.length()>a.length()){
            return a;
        }
        return res.toString();
    }
}
