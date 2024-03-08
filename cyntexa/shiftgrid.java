package cyntexa;

import java.util.ArrayList;
import java.util.List;

public class shiftgrid {
     public void swap(int [][]arr1,int [][]arr2){
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                int temp=arr1[i][j];
                arr1[i][j]=arr2[i][j];
                arr2[i][j]=temp;
            }
        }
    }
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=grid.length;
        int m=grid[0].length;
        int arr[][]=new int[n][m];
        for(int x=0;x<k;x++){
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(i==n-1 && j==m-1){
                        arr[0][0]=grid[n-1][m-1];
                    }
                    else if(j==m-1){
                        arr[i+1][0]=grid[i][m-1];
                    }
                    else{
                        arr[i][j+1]=grid[i][j];
                    }
                }
            }
            swap(arr,grid);
        }
        for(int i=0;i<n;i++){
            List<Integer> l=new ArrayList<>();
            for(int j=0;j<m;j++){
                l.add(grid[i][j]);
            }
            ans.add(l);
        }
        return ans;
         
    }
}
/*
 * Given a 2D grid of size m x n and an integer k. You need to shift the grid k times.

In one shift operation:

Element at grid[i][j] moves to grid[i][j + 1].
Element at grid[i][n - 1] moves to grid[i + 1][0].
Element at grid[m - 1][n - 1] moves to grid[0][0].
Return the 2D grid after applying shift operation k times.

 

Example 1:


Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 1
Output: [[9,1,2],[3,4,5],[6,7,8]]
Example 2:


Input: grid = [[3,8,1,9],[19,7,2,5],[4,6,11,10],[12,0,21,13]], k = 4
Output: [[12,0,21,13],[3,8,1,9],[19,7,2,5],[4,6,11,10]]
Example 3:

Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 9
Output: [[1,2,3],[4,5,6],[7,8,9]]
 
 */
