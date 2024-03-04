package cyntexa;

public class maxdiff {
    public static void main(String[] args) {
        int arr[]={2,3,10,6,4,8,1} ;
        int max=maxDiff(arr);
        System.out.println(max);
    }
    public static int maxDiff(int []arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                 if(j>i){
                    int d=arr[j]-arr[i];
                    max=Math.max(max,d);
                 }
            }
        }
        return max;
    }
}
/*
 * Given : An array, "arr[]" of size 'n', n>=2.
Task -
Find maximum value of " arr[j] - arr[i] " where j>i and i,j are indices of array.

Example I/P - arr[] = {2 , 3 , 10 , 6 , 4 , 8 , 1}
O/P - 8
(Because, 10 - 2 = 8)
 */
