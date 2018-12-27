import java.util.*;
import java.io.*;
import java.lang.*;

public class primus
{
    public static void main(String[]args) throws Exception
    {
        Scanner fin=new Scanner(new File("primus_in.dat"));
        PrintWriter fout=new PrintWriter(new File("primus_out.dat"));
        int start=fin.nextInt();
        int end=fin.nextInt();
        fout.println("Prime numbers from "+start+" to "+end+":");
        skip:for(int i=start;i<end;i++)
        {
            for(int j=2;j<i/2+1;j++)
            {
                if(i%j==0) continue skip;
            }
            fout.println(i);
        }
        fout.close();
    }
   
}
