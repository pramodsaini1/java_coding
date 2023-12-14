package BinarySearch;

public class paekmountain {
    public int peakIndexInMountainArray(int[] arr) {
        // for(int i=1;i<arr.length-1;i++){
        //     if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
        //         return i;
        //     }
        // }
        // return -1;
      int s=0;
      int e=arr.length-1;
      while(s<e){
          int mid=s+(e-s)/2;
          if(arr[mid]>arr[mid+1]){
              //you are decresing part
              //this may be the ans,but look the left
              //this is why end!=mid-1;
              e=mid;
          }
          else{
              // you are the ascending part
              s = mid+1;
          }
      }
      return s;

    }
}
