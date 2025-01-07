import java.util.*;
public class inputj {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
    //   String input = sc.next();
    //   System.out.println(input); 
    //   String input = sc.nextLine();
    //   System.out.println(input);
         int num = sc.nextInt();
         System.out.println(num);

         float price = sc.nextFloat();
         System.out.println(price);

         double p = sc.nextDouble();
         System.out.println(p);

         boolean var=sc.nextBoolean();
         System.out.println(var);

         Short s = sc.nextShort();
         System.out.println(s);

         Long l = sc.nextLong();
         System.out.println(l);

        sc.close();
    }
}
