import java.util.ArrayList;
import java.util.List;

public class symmetric {
    public int countSymmetricIntegers(int low, int high) {
        int result = 0;
        for (int i = low; i <= high; i++) {
            int value = i;
            List<Integer> list = new ArrayList<>();
            while (value > 0) {
                list.add(value % 10);
                value = value / 10;
            }
            if (list.size() % 2 != 0) {
                continue;
            }
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < list.size() / 2; j++) {
                sum1 = sum1 + list.get(j);
            }
            for (int j = list.size() / 2; j < list.size(); j++) {
                sum2 = sum2 + list.get(j);
            }
            if (sum1 == sum2) {
                result++;
            }
        }
        return result;
    }
}
/*
 * You are given two positive integers low and high.

An integer x consisting of 2 * n digits is symmetric if the sum of the first n digits of x is equal to the sum of the last n digits of x. Numbers with an odd number of digits are never symmetric.

Return the number of symmetric integers in the range [low, high].

 

Example 1:

Input: low = 1, high = 100
Output: 9
Explanation: There are 9 symmetric integers between 1 and 100: 11, 22, 33, 44, 55, 66, 77, 88, and 99.
Example 2:

Input: low = 1200, high = 1230
Output: 4
Explanation: There are 4 symmetric integers between 1200 and 1230: 1203, 1212, 1221, and 1230.
 
 */
