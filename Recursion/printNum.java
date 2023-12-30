package Recursion;

public class printNum {
    public static void main(String[] args) {
         int n=1;
        printNum(n);
    }
    static void printNum(int i){
           if (i<=5) {
                System.out.print(i+" ");
                printNum(i+1);
           }
    }
}
