package cyntexa;

import java.util.Scanner;

public class traivelingZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter value of n:");
        n=sc.nextInt();
        System.out.println(TrailingZero(n));
    }
    public static int TrailingZero(int n){
         int count=0;
          int num=fact(n);
          while(num>0){
            int a=num%10;
            if(a==0){
                count++;
            }
            num=num/10;
          }
          return count;
    }
    public static int fact(int n){
        if(n==1||n==0){
            return n;
        }
        else{
            return n*fact(n-1);
        }
    }
}
