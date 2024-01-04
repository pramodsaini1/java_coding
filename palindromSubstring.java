public class palindromSubstring {
    int count=1;
    public int countSubstrings(String s) {
        if(s.length()==0 || s==null){
            return 0;
        } 
        for(int i=0;i<s.length()-1;i++){
            checkPalindrome(s,i,i);
            checkPalindrome(s,i,i+1);

        }
        return count;
        

   }
   public void checkPalindrome(String s,int l,int r){
       while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
           count++;
           r++;
           l--;
       }
   }
    
}
/*
 * Given a string s, return the number of palindromic substrings in it.

A string is a palindrome when it reads the same backward as forward.

A substring is a contiguous sequence of characters within the string.

 

Example 1:

Input: s = "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".
Example 2:

Input: s = "aaa"
Output: 6
Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
 
 */
