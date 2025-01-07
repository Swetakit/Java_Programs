//import java.util.Scanner;

import java.util.*;

public class average {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number:\n");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float sum = a + b + c;
        float avg = sum/3;
        System.out.println("Average of 3 numbers: " + avg);

        sc.close();

    }
}
