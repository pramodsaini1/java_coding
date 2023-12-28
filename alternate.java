public class alternate {
    public int alternateDigitSum(int n) {
        int sum = 0;
          int countDigit = 0;

          // Count the number of Digits in the number
          int num = n;
          while (num > 0) {
              
              num = num / 10;
              countDigit += 1;
          }

          char sign = '+';
          
          // If number of digits are even then sign of first digit will be -ve.
          if (countDigit % 2 == 0) {

              sign = '-';

          } 
         
          // Calculating the sum
          while (n > 0) {

              int rem = n % 10;
              
              if (sign == '-') {

                  sum = sum + rem*(-1);

                  sign = '+';

              } else {

                  sum = sum + rem;

                  sign = '-';
              }
              

              n = n/10;
          }

          return sum;
   }
}
/*
 * You are given a positive integer n. Each digit of n has a sign according to the following rules:

The most significant digit is assigned a positive sign.
Each other digit has an opposite sign to its adjacent digits.
Return the sum of all digits with their corresponding sign.

 

Example 1:

Input: n = 521
Output: 4
Explanation: (+5) + (-2) + (+1) = 4.
Example 2:

Input: n = 111
Output: 1
Explanation: (+1) + (-1) + (+1) = 1.
Example 3:

Input: n = 886996
Output: 0
Explanation: (+8) + (-8) + (+6) + (-9) + (+9) + (-6) = 0.
 */
