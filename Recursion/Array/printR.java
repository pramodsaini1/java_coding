package Recursion.Array;

public class printR {
    public static void printNum(int n){
        if(n>=1){
            System.out.print(n+" ");
            printNum(n-1);
        }
    }
    public static void main(String[] args) {
        int i=5;
        printNum(i);
    }

}
