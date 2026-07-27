package array;

import java.util.Arrays;
import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {
        int min=0,max=0;
        Scanner s=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter the array elements:");
        for(int i=0;i<a.length;i++) {
            a[i] = s.nextInt();
        }
        min=a[0];
        max=a[0];
        for(int i=0;i<a.length;i++){

         if(a[i]<min){
             min=a[i];
         }
         if(a[i]>max){
             max=a[i];
         }
        }
        System.out.println(Arrays.toString(a));
        System.out.println("Min:"+min+"\nMax:"+max);
    }
}
