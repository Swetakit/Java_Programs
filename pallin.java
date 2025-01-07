import java.util.*;

public class pallin {
    public static void pallindrome(int num)
    {
        int n=num,rev=0;
        while (num>0) {
            int d=num%10;
            rev=(rev*10)+d;
            num=num/10;            
        }
        if (rev == n) {
            System.out.println("Number is pallindrome");            
        }
        else{
            System.out.println("Numer is not a pallindrome");
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check for pallindrome");
        int num=sc.nextInt();
        pallindrome(num);
        
        sc.close();
    }
}
