package Maths;

public class findunique {
    public int[] sumZero(int n) {
        int arr[]=new int[n];
        int d=-(n/2);
        if(n%2!=0){
            for(int i=0;i<n;i++){
                arr[i]=d;
                d++;
            }
        }
        else{
            for(int i=0;i<n;i++){
                if(d==0){
                    d++;
                }
                arr[i]=d;
                d++;
            }
        }
        return arr;
    }
}
/*
 * Given an integer n, return any array containing n unique integers such that they add up to 0.

 

Example 1:

Input: n = 5
Output: [-7,-1,1,3,4]
Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
Example 2:

Input: n = 3
Output: [-1,0,1]
Example 3:

Input: n = 1
Output: [0]
 */
