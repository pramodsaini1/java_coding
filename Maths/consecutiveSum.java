package Maths;

public class consecutiveSum {
    public int consecutiveNumbersSum(int n) {
        int count=0,sum=0;
        for(int i=1;sum<n;i++){
            sum +=i;
            if((n-sum)%i==0){
                count++;
            }
        }
        return count;
    }
}
/*
 * Given an integer n, return the number of ways you can write n as the sum of consecutive positive integers.

 

Example 1:

Input: n = 5
Output: 2
Explanation: 5 = 2 + 3
Example 2:

Input: n = 9
Output: 3
Explanation: 9 = 4 + 5 = 2 + 3 + 4
Example 3:

Input: n = 15
Output: 4
Explanation: 15 = 8 + 7 = 4 + 5 + 6 = 1 + 2 + 3 + 4 + 5
 */
