import java.util.*;
public class frqarray {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n;
         System.out.println("Enter value of n:");
         n=sc.nextInt();
         int arr[]=new int[n];
         System.out.println("Enter element in array:");
         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }
         int count[]=new int[n];
         for(int i=0;i<n;i++){
            count[arr[i]]++;
         }
         for(int i=0;i<count.length;i++){
            if(count[i]>0){
                System.out.println(i+"found"+count[i]+"times");
            }
         }
    }
}
