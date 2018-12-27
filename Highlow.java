import java.util.Scanner;
public class Highlow
{
    public static void main(String[] args)
    {
        int count=1;
        String user="";
        Scanner sc= new Scanner(System.in);
        int secret=(int)(1000*Math.random()+1);
        while(count<=12&&user!="y")
        {
            
            System.out.println("Try: "+count+"\nIs the number "+secret);
            System.out.print("Yes (Y), High (H), or Low (L) ?");
            user=sc.nextLine().toLowerCase();
            System.out.println(user);
            if(user.equals("h"))
            {
                secret=(int)(secret*Math.random()+1);
            }
            else if(user.equals("l"))
            {
                secret=(int)((1000-secret)*Math.random()+secret);
            }
            else if(user.equals("y")){break;}
            else 
            {
                System.out.println("Invalid Entry. Try again.");
                continue;
            }
            count++;
        }
        if(count<=12) System.out.println("You win\nThe nummber was guessed "+count+" times");
        else System.out.println("you lose");
    }
}
