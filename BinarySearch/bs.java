package BinarySearch;

public class bs {
    public static void main(String[] args) {
        int arr[]={2,4,6,9,11,12,14,20,36,48};
        int target=36;
        System.out.println(BinarySearch(arr,target));
    }
    static int BinarySearch(int arr[],int target){
        if (arr.length==0) {
            return -1;
        }
        int mid,min=0,max=arr.length-1;
        // mid=(min+max)/2;this may exceed the int reange
        //mid=min+(max-min)/2;
        
        while(min<=max){
              mid=min+(max-min)/2;
            if (arr[mid]==target) {
                return mid;
                 
            }
            else if (target>arr[mid]) {
                min=mid+1;
            }
            else{
                max=mid-1;
            }

        }
        return -1;
    }
}
