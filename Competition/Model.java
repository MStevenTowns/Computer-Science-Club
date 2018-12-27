import java.util.*;
import java.io.*;
public class Model
{
    public static void main(String[] args) throws Exception
    {
        double[] initial= new double[]{5, 1.5, 2, 1, 1, .75,.75,.5};
        double[] additional=new double[]{1, .75, .5,.5,.5,.375,.375,.15};
        String[] scale=new String[]{"O","On3","S","Sn3","HO","HOn3","TT","N"};
        Scanner scan=new Scanner(new File("Model.in"));
        int amt=scan.nextInt();
        String[] table=new String[amt];
        double total=0;
        for(int i=0;i<amt;i++)
        {
            String scales=scan.next();
            int additionals=scan.nextInt();
            int x=-1;
            for(int j=0;j<scale.length;j++)
            {
                if(scale[j].equals(scales)) x=j;
            }
            total=(initial[x]+(additional[x]*additionals));
            String totalg=String.format("%.2f",total*28.349);
            String totals=String.format("%.2f",total);            
            table[i]=scale[x]+"\t\t"+additionals+"\t\t"+totals+"\t\t"+totalg;
        }
        PrintWriter fout = new PrintWriter(new File("Model.out"));
        fout.println("Scale\tLength\tOunces\t\tGrams");    
        for(int i=0;i<amt;i++)
        {
            fout.println(table[i]);
        }
        fout.close();
    }
}
