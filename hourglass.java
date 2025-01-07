import java.util.*;

public class hourglass {
    public static int maximunSum(int arr[][]){
        int maxSum=0;
        for(int i=0;i<=3;i++){
            for(int j=0;j<=3;j++){
                int currSum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                if(currSum>maxSum){
                    maxSum=currSum;
                }
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[][]={{1, 1, 1, 0, 0, 0},
                     {0, 1, 0, 0, 0, 0},
                     {1, 1, 1, 0, 0, 0},
                     {0, 0, 2, 4, 4, 0},
                     {0, 0, 0, 2, 0, 0},
                     {0, 0, 1, 2, 4, 0}};

        System.out.print(maximunSum(arr));
    }
}
