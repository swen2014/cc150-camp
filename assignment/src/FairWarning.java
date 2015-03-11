/**
 * Created by steven on 2/18/15.
 */
/*
* for a test case with n biginteger, t1- ti,
* find the minimum y that for ti + y have the largest common divisor
* */
import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class FairWarning {
    public static void main(String[] args) throws Exception
    {
//    Scanner sc=new Scanner(new File("B-small-attempt0.in"));
//    PrintWriter pw=new PrintWriter(new File("B-small-attempt0.out"));
        Scanner sc=new Scanner(new File("B-large-practice.in"));
        PrintWriter pw=new PrintWriter(new File("B-large.out"));

        int nt=sc.nextInt();
        for (int tn=1; tn<=nt; tn++)
        {
            pw.print("Case #" + tn + ": ");

            int n=sc.nextInt();
            BigInteger a[]=new BigInteger[n];
            for (int i=0; i<n; i++)
                a[i]=sc.nextBigInteger();
            Arrays.sort(a);

            BigInteger res=a[1].subtract(a[0]);
            for (int i=0; i<n; i++)
                for (int j=i+1; j<n; j++)
                    res=res.gcd(a[j].subtract(a[i]));

            a[0]=a[0].mod(res);
            a[0]=res.subtract(a[0]).mod(res);

            pw.println(a[0]);
        }
        pw.close();
    }
}
