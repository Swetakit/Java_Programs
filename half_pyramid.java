public class half_pyramid {
    public static void main(String[] args) {
        int a=3;
        for(int i=1; i<=4 ; i++)
        {
            for(int k = a ; k>=1 ;k--)
            {
                System.out.print(" ");
            }
            for(int j=1 ; j<=i ; j++)
            {
                    System.out.print("*");
            }
            System.out.println();
            a--;
        }
    }
}
