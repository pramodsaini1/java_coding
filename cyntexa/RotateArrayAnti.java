package cyntexa;

import java.util.Arrays;

public class RotateArrayAnti {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int d=2;
        Rotate(arr,d);
        System.out.println(Arrays.toString(arr));
    }
    public static void Rotate(int arr[],int d){
          int temp[]=new int[arr.length];
          for(int i=0;i<arr.length;i++){
            temp[(i+d)%arr.length]=arr[i];
          }
          for(int i=0;i<temp.length;i++){
            arr[i]=temp[i];
          }
    }
}
