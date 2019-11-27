import java.util.HashMap;

public class NthFib {
	
	public static void main(String[] args) {
		int nth =10;
		System.out.println(nth + "th Fib Normal is : " + nthFibNormal(nth));
		System.out.println(nth + "th Fib Formula is : " + nthFibFormula(nth));
		System.out.println(nth + "th Fib Recur is : " + nthFibRecur(nth));
	}
	
	public static int nthFibNormal(int nth) {
		//Based on my current knowledge
		int n1=0, n2=1;
		HashMap fseries = new HashMap();
		
		fseries.put(n1, n1);
		fseries.put(n2, n2);
		for(int i=2; i<=nth; i++) {
			int nNew = n1 + n2;
			fseries.put(i, nNew);
			n1 = n2;
			n2 = nNew;
		}
		
		return (Integer)fseries.get(nth);
	}
	
	public static int nthFibFormula(int nth) {
		//Based on formula
		double Phi = (Math.sqrt(5)+1)/2;
		
		return (int) (((Math.pow(Phi, nth) - Math.pow(Phi*-1, nth*-1))) / Math.sqrt(5));
	}
	
	public static int nthFibRecur(int nth) {
		//Based on recursion
		if (nth <= 1)
			return nth;
		return nthFibRecur(nth -1) + nthFibRecur(nth - 2);
	}
}
