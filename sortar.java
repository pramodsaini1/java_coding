public class sortar {
    public static void main(String[] args) {
        int arr[]={12321,47283,98261,88243,65535};
        int count[]=new int[10];
        for(int i=0;i<arr.length;i++){
            count[arr[i]%10]++;
            arr[i]=arr[i]/10;
            for(int j=0;j<count.length;j++){
                 while(count[j]>0){
                    arr[i]=arr[i]*10+j;
                     count[j]--;
                 }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
