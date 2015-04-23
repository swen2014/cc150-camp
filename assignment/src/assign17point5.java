import com.jniwrapper.Str;

/**
 * Created by steven on 4/12/15.
 */
public class assign17point5 {

    static int[] masterMind(String guess, String solution){
        if (guess.length() != solution.length())
            return new int[] {0,0};
        char[] gs = guess.toCharArray();
        char[] ss = solution.toCharArray();

        int r=0,y=0,g=0,b=0;
        int rg=0,yg=0,gg=0,bg=0;
        int hit=0, pseudohit=0;
        for (int i=0; i<ss.length; i++){
            switch (ss[i]){
                case 'R':r++;break;
                case 'Y':y++;break;
                case 'G':g++;break;
                case 'B':b++;break;
            }
            switch (gs[i]){
                case 'R':rg++;break;
                case 'Y':yg++;break;
                case 'G':gg++;break;
                case 'B':bg++;break;
            }
            if (ss[i] == gs[i]){
                hit++;
            }
        }
        int sum = 0;
        if (rg != 0) sum += (rg<r?rg:r);
        if (yg != 0) sum += (yg<y?yg:y);
        if (gg != 0) sum += (gg<g?gg:g);
        if (bg != 0) sum += (bg<b?bg:b);

        int[] res = new int[2];
        res[0] = hit;
        res[1] = sum - hit;
        return res;
    }
}
