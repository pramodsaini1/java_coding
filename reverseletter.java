public class reverseletter {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
      int i = 0, j = s.length() - 1;
      while (i < j) {
          while (i < j && !Character.isLetter(arr[i]))
              i++;
          while (i < j && !Character.isLetter(arr[j]))
              j--;
          if (i < j) {
              char t = arr[i];
              arr[i] = arr[j];
              arr[j] = t;
          }
          i++;
          j--;
      }
      return new String(arr);
  }
}
/*
 * Given a string s, reverse the string according to the following rules:

All the characters that are not English letters remain in the same position.
All the English letters (lowercase or uppercase) should be reversed.
Return s after reversing it.

 

Example 1:

Input: s = "ab-cd"
Output: "dc-ba"
Example 2:

Input: s = "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"
Example 3:

Input: s = "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"
 */
