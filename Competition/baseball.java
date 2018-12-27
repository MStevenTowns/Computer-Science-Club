import java.util.*;
import java.io.*;
import java.lang.*;

public class baseball
{
    public static void main(String[]args) throws Exception
    {
        Scanner fin=new Scanner(new File("baseball.dat"));
        PrintWriter fout=new PrintWriter(new File("baseball.out"));
        ArrayList<Integer> all;
        int a=0;
        int h=0;
        while(fin.hasNextInt())
        {
            all.add(fin.nextInt());
        }
        for(int i=0;i<9;i++
        {
            a+=fin.nextInt();
            h+=fin.nextInt()
        }
        
        
        if(hScore>aScore) fout.println("home team wins "+hScore+"to "+aScore+"in "+innings+" innings");
        if(aScore>hScore) fout.println("away team wins "+aScore+"to "+hScore+"in "+innings+" innings");
        
        fout.close();   
    }
    public static 
}
