import java.util.*;
import java.io.*;

class train
{
    int block;
    public train(int block)
    {
        this.block=block;
    }
    public int getBlock()
    {
        return block;
    }
    public void move()
    {
        block-=1;
    }
}
public class Railroading
{
    public static void main(String[]args) throws Exception
    {
        Scanner scan = new Scanner(new File("Railroading.in"));
        PrintWriter fout = new PrintWriter(new File("Railroading.out"));
        int blocks=scan.nextInt();
        int trains=scan.nextInt();
        train[] x=new train[trains];
        for(int i=0;i<trains;i++)
        {
            scan.nextInt();
            x[i]=new train(scan.nextInt());
        }
        int[] blocker=new int[blocks];
        for(int i=0;i<x.length;i++)
        {
            if(x[i].getBlock()!=0) blocker[i]=(x[i].getBlock());
            else blocker[i]=0;
        }
        String[] colors=new String[blocks];
        colors[0]="Green";
        
        int count = 2;
        String[] open=new String[blocks];
        for(int i=0; i<blocks; i++)
        {
            open[i]="None";
        }
        for(int i=0;i<x.length;i++)
        {
            if(blocker[i]==0) open[i]="Train 1";
            else
            {
                open[blocker[i]]="Train "+ count;
                count++;
            }
        }
        for(int i=0;i<blocks;i++)
        {
            if(!open[i].equals("None")) colors[i]="Red";
            else if(i!=0 && colors[i-1].equals("Red")) colors[i]="Yellow";
            else colors[i]="Green";
        }
        String[] table=new String[blocks];
        for(int i=0; i<blocks; i++)
        {
            table[i]="Block "+i+"\t\t"+open[i]+"\t\t"+colors[i];
        }
        for(int i=0; i<blocks; i++)
        {
            fout.println(table[i]);
        }
        for(int i=trains-1;i>0;i--)
        {
            for(int j=blocks;j>=0;j--)
            {
                int next=x[i-1].getBlock();
                if(x[i].getBlock()-1==next) break;
                x[i].move();
            }
        }
        for(int i=0;i<x.length;i++)
        {
            if(x[i].getBlock()!=0) blocker[i]=(x[i].getBlock());
            else blocker[i]=0;
        }
        colors[0]="Green";
        count = 2;
        for(int i=0; i<blocks; i++)
        {
            open[i]="None";
        }
        for(int i=0;i<x.length;i++)
        {
            if(blocker[i]==0) open[i]="None";
            else
            {
                open[blocker[i]]="Train "+ count;
                count++;
            }
        }
        for(int i=1;i<blocks;i++)
        {
            if(!open[i].equals("None")) colors[i]="Red";
            else if(colors[i-1].equals("Red")) colors[i]="Yellow";
            else colors[i]="Green";
        }
        for(int i=0; i<blocks; i++)
        {
            table[i]="Block "+i+"\t\t"+open[i]+"\t\t"+colors[i];
        }
        fout.println("\n");
        for(int i=0; i<blocks; i++)
        {
            fout.println(table[i]);
        }
        fout.close();
    }
}
