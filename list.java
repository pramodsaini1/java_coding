import java.util.ArrayList;
import java.util.List;

public class list {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList ls = new ArrayList<>();
        for(int i=left;i<=right;i++){
              int num=i;
              int count=0;
              while(num>0){
                  int rem=num%10;
                  if(rem==0){
                      count=0;
                      break;
                  }
                  else if(i%rem==0){
                      count++;
                      num=num/10;
                  }
                  else{
                      count=0;
                      break;
                  }
              }
              if(count>0){
                  ls.add(i);
              }
        }
        return ls;
}
