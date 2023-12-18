package BinarySearch.matrix;

public class sortMat {
    public static void main(String[] args) {
        
    }
    static int [] BinarySearch(int [][]matrix,int row,int cStart,int cEnd,int target){
        if (cStart<=cEnd) {
            int mid=cStart+(cEnd-cStart)/2;
            if (matrix[row][mid]==target) {
                 return new int[]{row,mid};
            }
            else if (matrix[row][mid]<target) {
                cStart=mid+1;
            }
            else{
                cEnd=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    static int [] search(int [][]matrix,int target){
        int row=matrix.length;
        int col=matrix[0].length;
        if (row==1) {
            return BinarySearch(matrix,0,0,col-1,target);
        }
        int rStart=0;
        int rEnd=row-1;
        int cmid=col/2;
        while (rStart<(rEnd-1)) {
            int mid=rStart+(rEnd-rStart)/2;
            if (matrix[mid][cmid]==target) {
                return new int[]{mid,cmid};
            }
            if (matrix[mid][cmid]<target) {
                rStart=mid;
            }
            else{
                rEnd=mid;
            }
        }
        if (matrix[rStart][cmid]==target) {
            return new int[]{rStart,cmid};
        }
         if (target<matrix[rStart][cmid-1]) {
             return BinarySearch(matrix,rStart,0,cmid-1,target);
         }
         if (target>=matrix[rStart][cmid+1]   ) {
             return BinarySearch(matrix,rStart,cmid+1,col-1,target);
         }
         if (target<=matrix[rStart+1][cmid-1]) {
             return BinarySearch(matrix,rStart,0,cmid-1,target);
         }
         else {
             return BinarySearch(matrix,rStart,0,cmid-1,target);
         }


    }
}
