package Recursion;

public class digitProd {
    public static void main(String[] args) {
        int ans=prod(1342);
        System.out.println(ans);
    }
    public static int prod(int num){
        if(num%10==num){
            return num;
        }
        return num%10 *prod(num/10);
    }
}
