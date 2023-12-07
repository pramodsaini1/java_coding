package BinarySearch;
//order Agnoistic binary search
public class bs1 {
    public static void main(String[] args) {
        int arr[]={99,18,75,22,11,10,5,2,-3};
        int target=22;
        System.out.println(BinarySearch(arr, target));
    }
    static int BinarySearch(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        //find whether the array is sort ascending or descending
         boolean isAsc;
         if(arr[start]<arr[end]){
            isAsc=true;
         }
         else{
            isAsc=false;
         }
         while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target>arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if(target>arr[mid]){
                     end=mid-1;
                     
                }
                else{
                    start=mid+1;
                }
            }
         }
         return -1;
    }
}
