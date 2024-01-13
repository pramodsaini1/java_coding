public class base7 {
    public String convertToBase7(int num) {
        int base=1;
        int ans=0;
        while(num!=0){
            int rem=num%7;
            ans +=base*rem;
            base *=10;
            num/=7;
        }
        return Integer.toString(ans);
    }
}
/*
 * Given an integer num, return a string of its base 7 representation.

 

Example 1:

Input: num = 100
Output: "202"
Example 2:

Input: num = -7
Output: "-10"
 
 */
