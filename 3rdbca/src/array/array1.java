package array;

import java.util.Arrays;
import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        int a[]=new int[5];
//        System.out.println("Enter the array elements:");
//        for(int i=0;i<a.length;i++){
//            a[i]=s.nextInt();
//        }
//        System.out.println(Arrays.toString(a));
        Scanner s = new Scanner(System.in);
        String str[] = new String[5];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < str.length; i++) {
            str[i] = s.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
