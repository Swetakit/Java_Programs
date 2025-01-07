import java.util.*;
public class reversearray {
    public static void reverse(int arr[]){
        int a[]=new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            a[j]=arr[i];
            j++;
        }
        int i=0;
        for(j=0;j<a.length;j++){
            arr[i]=a[j];
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        reverse(arr);
        System.out.println("Reversed array:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        //reverse(arr);
    }
}
