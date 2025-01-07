import java.util.*;

public class aaa{
    public static void sq(){
        for(int i=1;i<=100;i++){
            int s=i*i;
            if(s>100){
                break;
            }
            System.out.println(s);
            
        }
    }
    public static void main(String args[]){
        sq();
        //return 0;
    }
}
