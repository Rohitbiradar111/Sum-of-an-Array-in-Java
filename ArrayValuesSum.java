//This program prints the Sum of all Array Values in Java

import java.util.Scanner;
public class ArrayValuesSum {
    public static int sum(int arr[])
    {
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size = "); 
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter Array Values = ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Sum of the Array = "+ (sum(arr)));
    }
}