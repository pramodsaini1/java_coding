package Maths;

public class gcd {
    public static void main(String[] args) {
        int a=5,b=10;
        System.out.println(gcd(a,b));
    }
    public static int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
}
