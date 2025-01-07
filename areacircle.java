import java.util.*;

public class areacircle {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        float area= (float) 3.14 * r * r;            // or 3.14f
        System.out.println(area);
        sc.close();
}
}
