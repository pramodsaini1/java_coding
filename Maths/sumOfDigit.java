package Maths;

public class sumOfDigit {
    public static void main(String[] args) {
        int n=1342;
        System.out.println(Sum(n));
    }
    public static int Sum(int num){
        int sum=0;
        while(num>0){
            int a=num%10;
            sum +=a;
            num=num/10;
        }
        return sum;
    }
}
