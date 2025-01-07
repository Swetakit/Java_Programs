import java.util.*;

public class sqarea {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of the square: ");
        float r = sc.nextFloat();
        float area = r * r;
        System.out.println("\n Area of the circle: " +area );
        sc.close();
    }
}
