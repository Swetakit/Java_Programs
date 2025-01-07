import java.util.*;

public class factorial {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number whose factorial you want ");
        int num=sc.nextInt();
        int f=1;
        for(int i=1;i<=num;i++)
        {
            f=f*i;
        }
        System.out.println("Factorial of the given number "+f);
        sc.close();
    }
}
