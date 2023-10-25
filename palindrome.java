class palindrome{
    public static void main(String []arr){
        String s="madam";
        String s1="";
        for(int i=s.length()-1;i>=0;i--){
            s1=s1+s.charAt(i);
        }
        if(s.equals(s1)){
            System.out.println("String are palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}