package Recursion;

public class palindrome {
    static int rev(int num){
        int sum=0;
        while(num>0){
            sum = sum*10+num%10;
            num=num/10;
        }
        return sum;
    }
    static boolean isPalindrome(int num){
        return rev(num)==num;
    }
    public static void main(String[] args) {
        int n=121;
        System.out.println(isPalindrome(n));
    }
}
