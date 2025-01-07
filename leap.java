import java.util.*;

public class leap {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year");
        int yr=sc.nextInt();
        boolean x=(yr % 4)==0;
        boolean y=(yr % 100)!=0;
        boolean z=((yr % 100 == 0) && (yr % 400 == 0));
        if (x && (y || z)) 
        {
            System.out.println(yr+ " is a leap year");
        }else{
            System.out.println(yr+" is not a leap year");
        }
        sc.close();
    }
}
