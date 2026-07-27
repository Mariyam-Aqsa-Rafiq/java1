package array;

import java.util.Arrays;
import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a[][]=new int[3][3];
        System.out.println("Enter the array elements:");
        for(int i=0;i<a.length;i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = s.nextInt();
            }
        }
        int row=a.length;
        int col=a[0].length;
        int b[][]=new int[col][row];
        for(int i=0;i<row;i++) {
            for (int j = 0; j <col ; j++) {
                b[j][i]=a[i][j];
            }
        }
       System.out.println(Arrays.deepToString(b));
    }
}
