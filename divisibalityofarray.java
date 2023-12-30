public class divisibalityofarray {
    public int[] divisibilityArray(String word, int m) {
        int ans[]=new int[word.length()];
        long num=0;
        for(int i=0;i<word.length();i++){
            int d=word.charAt(i)-'0';
            num=num*10+d;
            if(num%m==0){
                ans[i]=1;
                num=0;
            }
            else{
                ans[i]=0;
                num=num%m;
            }
        }
        return ans;
  }
}
/*
 * You are given a 0-indexed string word of length n consisting of digits, and a positive integer m.

The divisibility array div of word is an integer array of length n such that:

div[i] = 1 if the numeric value of word[0,...,i] is divisible by m, or
div[i] = 0 otherwise.
Return the divisibility array of word.

 

Example 1:

Input: word = "998244353", m = 3
Output: [1,1,0,0,0,1,1,0,0]
Explanation: There are only 4 prefixes that are divisible by 3: "9", "99", "998244", and "9982443".
Example 2:

Input: word = "1010", m = 10
Output: [0,1,0,1]
Explanation: There are only 2 prefixes that are divisible by 10: "10", and "1010".
 
 */
