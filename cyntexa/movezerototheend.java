package cyntexa;

import java.util.Arrays;

public class movezerototheend {
    public static void main(String[] args) {
        int arr[]={7,9,0,5,0,3};
        moveZero(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void moveZero(int arr[]){
         int j=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=0){
              int temp=arr[j];
              arr[j]=arr[i];
              arr[i]=temp;
              j++;
            }
        }
    }
}
