import java.util.HashMap;
import java.util.Map;

public class makeArrayEmpty {
    Map<Integer, Integer> pos = new HashMap<>();
        long n = nums.length;
        long count = n;
        for (int i = 0; i < n; i++)
            pos.put(nums[i], i);
        Arrays.sort(nums);
        for (int i = 1; i < n; i++)
            if (pos.get(nums[i]) < pos.get(nums[i - 1]))
                count += n - i;
        return count;
}
/*
 * You are given an integer array nums containing distinct numbers, and you can perform the following operations until the array is empty:

If the first element has the smallest value, remove it
Otherwise, put the first element at the end of the array.
Return an integer denoting the number of operations it takes to make nums empty.

 

Example 1:

Input: nums = [3,4,-1]
Output: 5
Operation	Array
1	[4, -1, 3]
2	[-1, 3, 4]
3	[3, 4]
4	[4]
5	[]
Example 2:

Input: nums = [1,2,4,3]
Output: 5
Operation	Array
1	[2, 4, 3]
2	[4, 3]
3	[3, 4]
4	[4]
5	[]
Example 3:

Input: nums = [1,2,3]
Output: 3
Operation	Array
1	[2, 3]
2	[3]
3	[]

 */
