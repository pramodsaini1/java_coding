package Recursion.subset;

import java.util.ArrayList;

public class subSeqAscii {
    public static void main(String[] args) {
        System.out.println(subSeqAscii("", "abc"));
    }
    public static ArrayList<String> subSeqAscii(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> first=subSeqAscii(p+ch, up.substring(1));
        ArrayList<String> second=subSeqAscii(p, up.substring(1));
        ArrayList<String> third=subSeqAscii(p+(ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
