import java.util.Scanner;
public class Biggestof3
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt())
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            System.out.println(biggest(a,b,c));
        }
    }
    public static int biggest(int a,int b,int c)
    {
        if(a>=b&&a>=c) return a;
        if(b>=a&&b>=c) return b;
        return c;
    }
}
