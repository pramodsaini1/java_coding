public class Reorderedpair {
    public boolean canReorderDoubled(int[] arr) {
        int visited[]=new int[arr.length];
         Arrays.sort(arr);
         for(int i=0;i<arr.length;i++)
         {
             
             if(visited[i]==0)
             {
                 boolean check=false;
                 for(int j=i+1;j<arr.length;j++)
                 {
                     if(visited[j]==0 && (arr[j]==2*arr[i] || arr[i]==2*arr[j]))
                     {
                         visited[j]=1;
                         visited[i]=1;
                         check=true;
                         break;
                     }     
                 }
                 if(check==false)
                 {
                     //System.out.println(arr[i]);
                     return false;
                 }
                     
             }
             
         }
         return true;
     }
}
/*
 * Given an integer array of even length arr, return true if it is possible to reorder arr such that arr[2 * i + 1] = 2 * arr[2 * i] for every 0 <= i < len(arr) / 2, or false otherwise.

 

Example 1:

Input: arr = [3,1,3,6]
Output: false
Example 2:

Input: arr = [2,1,2,6]
Output: false
Example 3:

Input: arr = [4,-2,2,-4]
Output: true
Explanation: We can take two groups, [-2,-4] and [2,4] to form [-2,-4,2,4] or [2,4,-2,-4].
 */
