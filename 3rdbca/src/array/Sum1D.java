package array;

import java.util.Arrays;
import java.util.Scanner;

public class Sum1D {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int sum=0;
        int a[]=new int[5];
        System.out.println("Enter the array elements:");
        for(int i=0;i<a.length;i++){
            a[i]=s.nextInt();
            sum=sum+a[i];
        }
        System.out.println(Arrays.toString(a));
        System.out.println("Sum:"+sum);
    }
}
