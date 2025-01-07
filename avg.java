import java.util.*;

public class avg {
    public static float average(int a,int b,int c)
    {
        int sum=a+b+c;
        float averg=sum/3f;

        return averg;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 nos whose average you want to print: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float ans = average(a, b, c);
        System.out.println("Average of the two numbers: "+ans);
        
        sc.close();
    }
}
