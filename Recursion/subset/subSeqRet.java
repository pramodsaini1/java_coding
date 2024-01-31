package Recursion.subset;

import java.util.ArrayList;

public class subSeqRet {
    public static void main(String[] args) {
        System.out.println(subSeqRet("", "abc"));
    }
    public static ArrayList<String> subSeqRet(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String>left=subSeqRet(p+ch, up.substring(1));
        ArrayList<String>right=subSeqRet(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}
