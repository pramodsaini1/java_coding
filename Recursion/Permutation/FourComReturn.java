package Recursion.Permutation;

import java.util.ArrayList;

public class FourComReturn {
    public static void main(String[] args) {
        System.out.println(FourComReturn("", 4));
    }
    static ArrayList<String> FourComReturn(String p,int target){
        if(target==0){
            ArrayList<String> list=new ArrayList();
            list.add(p);
            return list;
        }
        ArrayList<String > ans=new ArrayList<>();
        for(int i=1;i<=6 && i<=target;i++){
            ans.addAll(FourComReturn(p+i, target-i));
        }
        return ans;
    }
}
