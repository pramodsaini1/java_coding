package Recursion.Array;

public class printN {
    public static void display(int n){
        if(n<=5){
            System.out.print(n+" ");
            display(n+1);
        }
    }
    public static void main(String[] args) {
        int i=1;
        display(i);
    }
}
