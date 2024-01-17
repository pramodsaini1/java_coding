package Recursion;

public class countZeroes {
    static int countZeroes(int num){
        int count=0;
        while(num>0){
            int rem=num%10;
            if(rem==0){
                count++;
            }
            num=num/10;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countZeroes(30304));
    }
}
