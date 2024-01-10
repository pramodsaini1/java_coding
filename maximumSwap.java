public class maximumSwap {
    public int maximumSwap(int num) {
        String s=Integer.toString(num);
        int max=num;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                char ch[]=s.toCharArray();
              char c=ch[i];
              ch[i]=ch[j];
              ch[j]=c;
              String temp=String.valueOf(ch);
             int n=Integer.parseInt(temp);
             max=Math.max(n,max);
            }
        }
        return max;
        

  }
}
/*
 * You are given an integer num. You can swap two digits at most once to get the maximum valued number.

Return the maximum valued number you can get.

 

Example 1:

Input: num = 2736
Output: 7236
Explanation: Swap the number 2 and the number 7.
Example 2:

Input: num = 9973
Output: 9973
Explanation: No swap.
 */
