package Recursion.sorting;

public class originalarray {
    public int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        if(n%2 != 0) return new int[]{};
         int[] ans = new int[n/2];
         int[] count = new int[100001];
         for(int i=0; i<n; i++){
            count[changed[i]]++;
        }
        int k=0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0 && i*2 < 100001 && count[i*2] > 0){
                ans[k++] = i;
                count[i]--;
                count[i*2]--;
            }
        }
        for(int i=0; i<count.length; i++){
            if(count[i] != 0) return new int[]{};
        }
        
        return ans;
        
    }
}
/*
 * An integer array original is transformed into a doubled array changed by appending twice the value of every element in original, and then randomly shuffling the resulting array.

Given an array changed, return original if changed is a doubled array. If changed is not a doubled array, return an empty array. The elements in original may be returned in any order.

 

Example 1:

Input: changed = [1,3,4,2,6,8]
Output: [1,3,4]
Explanation: One possible original array could be [1,3,4]:
- Twice the value of 1 is 1 * 2 = 2.
- Twice the value of 3 is 3 * 2 = 6.
- Twice the value of 4 is 4 * 2 = 8.
Other original arrays could be [4,3,1] or [3,1,4].
Example 2:

Input: changed = [6,3,0,1]
Output: []
Explanation: changed is not a doubled array.
Example 3:

Input: changed = [1]
Output: []
Explanation: changed is not a doubled array.
 
 */
