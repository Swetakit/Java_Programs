public class MergeSorted {
    public static void main(String args[]){
        int m=3,n=3;
        int num1[]=new int[6];
        int num2[]=new int[3];
        num1[0]=1;
        num1[1]=2;
        num1[2]=3;
        num1[3]=0;
        num1[4]=0;
        num1[5]=0;

        num2[0]=2;
        num2[1]=5;
        num2[2]=6;

        mergesortedarray(num1,num2,m,n);
        for(int i=0;i<6;i++){
            System.out.println(num1[i]+ " ");
        }
    }
    public static void mergesortedarray(int[] num1,int[] num2,int m,int n) {
        int i=m-1,j=n-1,x=m+n-1;
        while (i>=0 && j>=0) {
            if(num1[i] > num2[j]){
                num1[x]=num1[i];
                x--;i--;
            }else{
                num1[x]=num2[j];
                x--;j--;
            }
            
        }  
        while (j>=0) {
            num1[x]=num2[j];
            j--;x--;
        }      
    }
}
