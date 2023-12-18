public class minCOm {
    public int getCommon(int[] nums1, int[] nums2) {
        int i=0,j=0,m=nums1.length,n=nums2.length;
        while(i<m && j<n){
            if(nums1[i]==nums2[j]){
                return nums1[i];
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return -1;
   }
}
