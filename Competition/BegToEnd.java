import java.util.*;
import java.io.*;
public class BegToEnd
{
    public static void main(String[] args) throws Exception
    {
        Scanner scan=new Scanner(new File("BegToEnd.in"));
        int beg1=scan.nextInt();
        int end1=scan.nextInt();
        int beg2=scan.nextInt();
        int end2=scan.nextInt();
        String out;
        int num;
        PrintWriter fout = new PrintWriter(new File("BegToEnd.out"));
        for(int i=beg1;i<end1;i++)
        {
            for(int j=beg2;j<end2;j++)
            {
                num=i*j;
                out=num+"";
                if(!(out.substring(0,1).equals("1") && out.substring(out.length()-1).equals("1")))
                {
                    if(out.substring(0,1).equals(out.substring(out.length()-1))) fout.println(num);
                }
            }
        }
        fout.close();
    }
}

