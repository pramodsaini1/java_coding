package Maths;

public class convertBase {
    public String baseNeg2(int n) {
        StringBuilder sc = new StringBuilder();
      int rem;
      int b = -2;
      if(n == 0) sc.append('0');
      
      while(n != 0){
          rem = n % b;
          n /= b;
          if(rem < 0){
              rem -= b;
              n++;
          }
          sc.append(rem);
      }
      return sc.reverse().toString();

  }
}
/*
 * Given an integer n, return a binary string representing its representation in base -2.

Note that the returned string should not have leading zeros unless the string is "0".

 

Example 1:

Input: n = 2
Output: "110"
Explantion: (-2)2 + (-2)1 = 2
Example 2:

Input: n = 3
Output: "111"
Explantion: (-2)2 + (-2)1 + (-2)0 = 3
Example 3:

Input: n = 4
Output: "100"
Explantion: (-2)2 = 4
 */
