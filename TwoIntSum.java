import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class TwoIntSum{

     public static void main(String []args){
        int sumInp = 7;
        
        List<Integer> arrInpList = Arrays.asList(1,5,7,8,2,0);
        ArrayList<Integer> arrInp = new ArrayList<Integer>();
        arrInp.addAll(arrInpList);
        
        System.out.println("Result:"+ findSumArr(arrInp, sumInp).toString());
     }
     
     private static List<List<Integer>> findSumArr(ArrayList<Integer> arrInp, int sumInp) {
         int tmpDiff = 0, i=0;
         ArrayList<List<Integer>> resultArr = new ArrayList<List<Integer>>();
         
         arrInp.sort(null);
         while(i < arrInp.size()) {
             tmpDiff = sumInp - arrInp.get(i);
              if (arrInp.contains(tmpDiff)) {
                 resultArr.add(new ArrayList<Integer>(Arrays.asList(arrInp.get(i), tmpDiff)));
                 arrInp.remove(i);
                 arrInp.remove(String.valueOf(tmpDiff));
             }
             i++;
         }
		return resultArr;
	}
}
