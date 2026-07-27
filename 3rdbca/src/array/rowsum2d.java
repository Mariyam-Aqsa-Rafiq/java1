package array;

import java.util.Arrays;
import java.util.Scanner;

public class rowsum2d {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int sum=0;
        int a[][]=new int[3][3];
        System.out.println("Enter the array elements:");
        for(int i=0;i<a.length;i++){
            sum=0;
            for(int j=0;j<a[i].length;j++){
                a[i][j]=s.nextInt();
                sum=sum+a[i][j];
            }
            System.out.println("Sum:"+sum);
        }
        System.out.println(Arrays.deepToString(a));
    }
}
