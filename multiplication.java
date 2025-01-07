import java.util.*;

public class multiplication {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number whose table you want to be printed ");
        int num=sc.nextInt();
        System.out.println("The table of the given number: ");
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+ " * " +i+ " = "+num*i );
        }
        sc.close();
    }
}
