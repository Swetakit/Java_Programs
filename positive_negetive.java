import java.util.*;

public class positive_negetive {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        if(num>=0)
        {
            System.out.println("Positive number");
        }else{
            System.out.println("Negetive number");
        }
        sc.close();
    }
}
