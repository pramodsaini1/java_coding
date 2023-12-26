public class firstPalindrome {
    public String firstPalindrome(String[] words) {
        String s="";
        for(int i=0;i<words.length;i++){
            s=words[i];
            if(check(s)){
                return s;
            }
        }
        return "";
    }
    public static boolean check(String s){
        String s1="";
        for(int i=s.length()-1;i>=0;i--){
            s1=s1+s.charAt(i);
        }
        if(s.equals(s1)){
            return true;
        }
        return false;
    }
}
/*
 * Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".

A string is palindromic if it reads the same forward and backward.

 

Example 1:

Input: words = ["abc","car","ada","racecar","cool"]
Output: "ada"
Explanation: The first string that is palindromic is "ada".
Note that "racecar" is also palindromic, but it is not the first.
Example 2:

Input: words = ["notapalindrome","racecar"]
Output: "racecar"
Explanation: The first and only string that is palindromic is "racecar".
Example 3:

Input: words = ["def","ghi"]
Output: ""
Explanation: There are no palindromic strings, so the empty string is returned.
 
 */
