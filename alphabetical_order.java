class alphabetical_order{
    public static void main(String []arr){
        String s="Rajasthan India BIkaner";
        String s1="";
        char c=' ';
        int m=1;
        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
           if(c!=' '){
               if(m%2==1){
                  if(c>=97 && c<=122){
                    c = (char)(c-32);
                  }
               }
               else{
                     if(c>=65 && c<=90){
                        c = (char)(c+32);
                     }
               }
               m++;
           }
           s1=s1+c;
        }
        System.out.println(s1);
    }
}