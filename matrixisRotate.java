public class matrixisRotate {
    public boolean findRotation(int[][] mat, int[][] target) {
        int arr[][]= rotate(mat,target);
        int nrr[][]=rotate(arr,target);
        int prr[][]=rotate(nrr,target);
        if(check(arr,target)||check(nrr,target)||check(prr,target)||check(mat,target)){
            return true;
        }
        return false;
    }
    public static int [][]rotate(int [][]mat,int [][]target){
        int arr[][]=new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                arr[j][mat[0].length-i-1]=mat[i][j];
            }
        }
        return arr;
    }
    public static boolean check(int [][]arr,int [][]target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]!=target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
/*
 * Given two n x n binary matrices mat and target, return true if it is possible to make mat equal to target by rotating mat in 90-degree increments, or false otherwise.

 

Example 1:


Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
Output: true
Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.
Example 2:


Input: mat = [[0,1],[1,1]], target = [[1,0],[0,1]]
Output: false
Explanation: It is impossible to make mat equal to target by rotating mat.
Example 3:


Input: mat = [[0,0,0],[0,1,0],[1,1,1]], target = [[1,1,1],[0,1,0],[0,0,0]]
Output: true
Explanation: We can rotate mat 90 degrees clockwise two times to make mat equal target.
 */
