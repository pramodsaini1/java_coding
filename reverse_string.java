class reverse_string{
    public static void main(String []arr){
        String s="Rajasthan India Bikaner";
        String s1="",s2="";
        char c=' ';
        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
            if(c!=' '){
                s1=s1+c;
            }
            else{
                for(int j=s1.length()-1;j>=0;j--){
                    s2=s2+s1.charAt(j);
                }
                 s1="";
                s2=s2+"";
            }
             
        }
        s2=s2+s1;
        System.out.println(s2);
         

    }
}