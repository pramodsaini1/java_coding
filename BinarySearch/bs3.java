package BinarySearch;

public class bs3 {
     public static void main(String[] args) {
        int arr[]={2,3,5,9,14,16,18};
          int floor=15;
           System.out.println(bsearch(arr,floor));
     }
     static int bsearch(int arr[],int floor){
         
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
             if (floor<arr[m]) {
                e=m-1;
             }
             else if (floor>arr[m]) {
                 s=m+1;
             }
             else{
                return arr[m];
             }
        }
        return -1;
     }
}
