import java.util.*;
import java.io.*;
public class calendar
{
    public static void main(String[]args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        GregorianCalendar c=new GregorianCalendar();
        //PrintWriter fout = new PrintWriter(new File("calendar."));
        
        while(sc.hasNextInt())
        {
            int month = sc.nextInt();
            int day = sc.nextInt();
            int year = sc.nextInt();
            int adv = sc.nextInt();
            System.out.println("\n"+adv);
            c.set(year,month,day+adv-1);
            System.out.println("date is " +c.get(Calendar.MONTH) + "/" + c.get(Calendar.DAY_OF_MONTH) + "/" + c.get(Calendar.YEAR));


            //not propperly accounting for leap years, but works otherwise
            
            
            
            /*if(adv==0) 
            {
                //System.out.println("\ndate is "+c.MONTH+"/"+c.DAY_OF_MONTH+"/"+c.YEAR+"\n");
            }
            
            else
            {
                //c.DAY_OF_MONTH=adv+c.DAY_OF_MONTH;
                //System.out.println(c.DAY_OF_MONTH);
                
                
                while(day>28)
                {
                    
                    if (month>12)
                    {
                        c.MONTH=1;
                        c.YEAR++;
                    }
                    if (month==2)
                    {
                        if(c.isLeapYear(c.YEAR))||(c.YEAR%400==0))//leap year
                        {
                            System.out.print("leap year: ");
                            c.DAY_OF_MONTH-=29;
                            c.MONTH+=1;
                        }
                        else
                        {
                            c.DAY_OF_MONTH-=28;
                            c.MONTH+=1;
                        }
                    }
                    else if((month==1||month==3||month==5||month==7||month==8||month==10||month==12)&&day>31)
                    {
                        c.DAY_OF_MONTH-=31;
                        c.MONTH+=1;
                    }
                    else if(day>30)
                    {
                        c.DAY_OF_MONTH-=30;
                        c.month+=1;
                    }
                    
                }
                System.out.println("date is "+month+"/"+day+"/"+year+"\n");
                //fout.println("in " + adv + " days the date will be ");
                //System.out.println("date is " +c.get(Calendar.MONTH) + "/" + c.get(Calendar.DAY_OF_MONTH) + "/" + c.get(Calendar.YEAR));
            }*/
        }
    }
}
