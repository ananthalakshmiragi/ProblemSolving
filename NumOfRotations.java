import java.util.*;

public class NumOfRotations{
  public static void main(String []args){
        List<Integer> arrInpList = Arrays.asList(7,8,1,2,3,4,5,6);
        ArrayList<Integer> arrInp = new ArrayList<Integer>();
        arrInp.addAll(arrInpList);
        
        System.out.println("Result:"+ fnNoOfRot(arrInp));
     }
     
    public static int fnNoOfRot(ArrayList<Integer> arrInp) {
         int first=0, mid=0, last=arrInp.size()-1, i=0;
         mid = first+last/2;
         
         while (first < last && first != mid && last != mid) {
             if (arrInp.get(first) <= arrInp.get(mid)) {
                 first = mid;
             }
             else {
                 last = mid;
             }
             mid = first+last/2;
         }
         return last;
     }
}
