package Recursion;

public class fibonacchi {
    public static void main(String[] args) {
         
        System.out.println(fibonacchi(10));
    }
    static int fibonacchi(int num){
        if (num==0 || num==1) {
              return num;
        }
        return fibonacchi(num-1)+fibonacchi(num-2);
    }
}
