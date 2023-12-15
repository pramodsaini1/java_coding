public class digswap {
    public int largestInteger(int num) {
        int c=count(num);
         int a[]=new int[c];
         int n=num;
         for(int i=c-1;i>=0;i--){
             a[i]=n%10;
             n=n/10;
         }
         int max=0;
         for(int i=0;i<c-1;i++){
             for(int j=i+1;j<c;j++){
                 if(a[i]%2==0 && a[j]%2==0 && a[j]>a[i]){
                     max=a[i];
                     a[i]=a[j];
                     a[j]=max;
                 }
                 if(a[i]%2==1 && a[j]%2==1 && a[j]>a[i]){
                     max=a[i];
                     a[i]=a[j];
                     a[j]=max;
                 }
             }
         }
         int sum=0;
         for(int i=0;i<c;i++){
             sum=sum*10+a[i];
         }
         return sum;
     }
     int count(int n){
         int c=0;
         while(n>0){
             c++;
             n=n/10;
         }
     return c;
     }
}
/*
 * You are given a positive integer num. You may swap any two digits of num that have the same parity (i.e. both odd digits or both even digits).

Return the largest possible value of num after any number of swaps.

 

Example 1:

Input: num = 1234
Output: 3412
Explanation: Swap the digit 3 with the digit 1, this results in the number 3214.
Swap the digit 2 with the digit 4, this results in the number 3412.
Note that there may be other sequences of swaps but it can be shown that 3412 is the largest possible number.
Also note that we may not swap the digit 4 with the digit 1 since they are of different parities.
Example 2:

Input: num = 65875
Output: 87655
Explanation: Swap the digit 8 with the digit 6, this results in the number 85675.
Swap the first digit 5 with the digit 7, this results in the number 87655.
Note that there may be other sequences of swaps but it can be shown that 87655 is the largest possible number.
 */
