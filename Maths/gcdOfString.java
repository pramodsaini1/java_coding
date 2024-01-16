package Maths;

public class gcdOfString {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        int a=str1.length();
        int b=str2.length();
        int gcd;
        if(a>b){
            gcd=GCD(a,b);
        }
        else{
            gcd=GCD(b,a);
        }
        return str1.substring(0,gcd);
   }
   public int GCD(int a,int b){
       return b==0?a:GCD(b,a%b);
   }
}
/*
 * For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

 

Example 1:

Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
Example 2:

Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
Example 3:

Input: str1 = "LEET", str2 = "CODE"
Output: ""
 */
