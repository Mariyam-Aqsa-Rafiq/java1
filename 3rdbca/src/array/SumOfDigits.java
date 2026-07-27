package array;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=s.nextInt();
        int sum=0;
        while(num!=0){
            int digit=num%10;
            sum+=digit;
            num=num/10;
        }
        System.out.println("Sum="+sum);
    }
}
