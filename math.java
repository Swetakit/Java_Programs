import java.util.*;

public class math {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two nos to perform various operations :");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println("Minimum of two nos: "+Math.min(a, b));
        System.out.println("Maximum of two nos: "+Math.max(a, b));
        System.out.println("Square root of "+ a + " : " +Math.min(a, b));
        System.out.println("power of the number: "+Math.pow(a, b));
       // System.out.println("Average of two nos: "+Math.avg(a, b));
       // System.out.println("Absolute of two nos: "+Math.abs(a, b));
       sc.close();
    }
}
