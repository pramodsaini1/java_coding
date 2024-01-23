package Recursion.pattern;

public class normalTraingle {
    public static void main(String[] args) {
        traingle(4, 0);
    }
    static void traingle(int r,int c){
        if(r==0){
            return ;
        }
        if(c<r){
            traingle(r, c+1);
            System.out.print("*");
        }
        else{
            traingle(r-1, 0);
            System.out.println();
        }
    }
}
