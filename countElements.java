public class countElements {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(maxFrequencyElements(arr));
    }
    public static int maxFrequencyElements(int []nums){
           int freq[]=new int[101];
           int maxfrq=0;
           for(int i=0;i<nums.length;i++){
                ++freq[nums[i]];
                maxfrq=Math.max(maxfrq,freq[nums[i]]);

           }
           int ans=0;
           for(int i=0;i<freq.length;i++){
              if(freq[i]==maxfrq){
                  ++ans;
              }
           }
           return ans*maxfrq;

    }
}
