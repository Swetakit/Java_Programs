import java.util.*;

public class sum_of_digits {
    public static  void sumofdigits(int num)
    {
        int sum=0;
        while (num>0) {
            int d = num % 10;
            sum = sum + d;
            num = num / 10;            
        }
        System.out.println("Sum of the given number is : " + sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        sumofdigits(num);

        sc.close();
    }
}
