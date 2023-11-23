public class arraysd {
    public static void main(String[] args) {
        int arr[]={12321,47283,98261,88243,65535};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            while(arr[i]>9){
                sum=0;
                while(arr[i]>0){
                    sum=sum+arr[i]%10;
                    arr[i]=arr[i]/10;
                }
                arr[i]=sum;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
