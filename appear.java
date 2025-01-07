import java.util.*;

public class appear {
    public static boolean count(int arr[])
{
    for(int i=0;i<arr.length;i++)
    {
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]==arr[j])
            {
                return true;
            }
        }
    }
    return false;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[]={1,1,1,3,3,4,3,2,4,2};
    System.out.println(count(arr));

    sc.close();
}
}
