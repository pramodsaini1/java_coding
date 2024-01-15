package Maths;

public class lcm {
    public static void main(String[] args) {
        int a=5,b=10;
        System.out.println(lcm(a,b));
    }
    public static int lcm(int a,int b){
        return a*b/gcd(a,b);
    }
    public static int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
}
