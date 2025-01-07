import java.util.*;

public class isEven {
    public static boolean is_Even(int num)
    {
        if(num==0)
        {
            System.out.println("Number is 0");
        }
        if(num % 2 == 0)
        {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check its even or odd: ");
        int num=sc.nextInt();
        boolean ans=is_Even(num);
        if(ans == true)
        {
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
        sc.close();
    }
}
