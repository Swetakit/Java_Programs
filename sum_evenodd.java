import java.util.*;

public class sum_evenodd {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c;
        int evensum=0;int oddsum=0;
        
        do{
            System.out.println("Enter the number:");
            int num=sc.nextInt();
            if(num % 2 == 0)
            {
                evensum=evensum+num;
            }
            else{
                oddsum=oddsum+num;
            }
            System.out.println("Enter choice 1 to enter number");
            c=sc.nextInt();
        }while(c==1);
        System.out.println("Sum of all even numbers entered "+evensum);
        System.out.println("Sum of all odd numbers entered "+oddsum);
        sc.close();
    }
}

