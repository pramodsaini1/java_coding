package String;

public class palindrome {
    public static String reverse(String st){
          String s1="";
          for(int i=st.length()-1;i>=0;i--){
            s1=s1+st.charAt(i);
          }
          return s1;
    }
    public static void main(String[] args) {
        String s="abcdcba";
        if (s.equals(reverse(s))) {
             System.out.println("Given String are Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
