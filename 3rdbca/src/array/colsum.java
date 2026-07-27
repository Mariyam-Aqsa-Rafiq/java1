package array;

import java.util.Arrays;
import java.util.Scanner;

public class colsum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int sum=0;
        int a[][]=new int[3][3];
        System.out.println("Enter the array elements:");
        for(int i=0;i<a.length;i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = s.nextInt();
            }
        }
        for(int j=0;j<a[0].length;j++){
            sum=0;
            for(int i=0;i<a.length;i++){

                sum=sum+a[i][j];
            }
            System.out.println("Sum:"+sum);
        }
//        System.out.println(Arrays.deepToString(a));
    }
}
