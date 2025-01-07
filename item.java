import java.util.*;

public class item {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost of pencil: ");
        float cpencil = sc.nextFloat();
        System.out.println("Enter cost of pen: ");
        float cpen = sc.nextFloat();
        System.out.println("Enter cost of eraser: ");
        float ceraser = sc.nextFloat();
        float totcp = cpencil +  cpen  + ceraser ;
        System.out.println("Total cost of the items without gst: " + totcp);
        System.out.println("Total cost of the items with gst: " + totcp*0.18f);
        sc.close();
    }
}
