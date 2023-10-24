class array{
    public static void main(String []arr){
        int arr[]={1,0,2,3,4,5,6,8,1,2,3};
        int b=0,count=0,group=0;
        for(int i=0;i<arr.length;i++){
            if(count==0){
                b=a[i];
            }
            if(arr[i]==b){
                count++;
                b++;
            }
            else{
                if(count>1){
                    group++;
                    System.out.println("starting point:"+(b-count)+"ending point:"+(b-1));
                }
                b=a[i]+1;
            }
        }
        if(count>1){
            group++;
            System.out.println("starting point:"+(b-count)+"ending point:"+(b-1));
        }
    }
}