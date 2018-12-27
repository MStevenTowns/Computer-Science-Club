import java.util.Scanner;
public class CoprimeCrap
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt())
        {
            int a=sc.nextInt();//num 1
            int b=sc.nextInt();//num 2
            if(good(a,b))
            {
                System.out.println("YES\n");
            }
            else System.out.println("NO\n");
        }
    }
    
    public static boolean good(int a,int b)
    {
        int small;
        if (a<b) {small=a;}
        else {small=b;}
        for(int i=2;i<=small;i++) 
        {
            if(a%i==0&&b%i==0)return false;
        }
        return true;
    }
}
