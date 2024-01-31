package Recursion.Permutation;

import java.util.ArrayList;

public class perList {
    public static void main(String[] args) {
        ArrayList<String > ans=PermutationList("", "abc");
        System.out.println(ans);
    }
    public static ArrayList<String> PermutationList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans=new ArrayList<>();

        char ch=up.charAt(0);

        for(int i=0;i<=p.length();i++){
            String f=p.substring(0, i);
            String s=p.substring(i,p.length());
            ans.addAll(PermutationList(f+ch+s,up.substring(1)));

        }
        return ans;
    }
}
