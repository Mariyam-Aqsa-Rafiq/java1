import java.sql.SQLOutput;
import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
        int a[][]={
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };
//        System.out.println(Arrays.deepToString(a));
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.println(a[i][j]+"");
            }
            System.out.println();
        }
    }
}
