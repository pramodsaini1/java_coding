package cyntexa;

public class sumofencrypted {
    private int task(int num)
    {
        int dup=num;
        int maxi=0;
        while(dup!=0)
        {
            maxi=Math.max(maxi,dup%10);
            dup/=10;
        }
        String dup1="";
        while(num!=0)
        {
            dup1+=maxi;
            num/=10;
        }
         return Integer.parseInt(dup1);
    }
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
                 sum +=task(nums[i]);
            
        }
        return sum;
    }
}
/*
 * You are given an integer array nums containing positive integers. We define a function encrypt such that encrypt(x) replaces every digit in x with the largest digit in x. For example, encrypt(523) = 555 and encrypt(213) = 333.

Return the sum of encrypted elements.

 

Example 1:

Input: nums = [1,2,3]

Output: 6

Explanation: The encrypted elements are [1,2,3]. The sum of encrypted elements is 1 + 2 + 3 == 6.

Example 2:

Input: nums = [10,21,31]

Output: 66

Explanation: The encrypted elements are [11,22,33]. The sum of encrypted elements is 11 + 22 + 33 == 66.
 */
