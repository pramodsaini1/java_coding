package BinarySearch;

public class bs2 {
    public static void main(String[] args) {
        int arr[]={2,3,5,9,14,16,18};
        int target=15;
        System.out.println(bsearch(arr,target));
    }
    static int bsearch(int arr[],int target){
        if (arr.length==0) {
            return -1;
        }
        int s=0;
        int e=arr.length-1;
        while (s<=e) {
            int mid=s+(e-s)/2;
            if (arr[mid]>=target) {
                return arr[mid];
            }
            else if(target>arr[mid]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return -1;
    }

}
