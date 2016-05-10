import java.util.ArrayList;
import java.util.List;

public class AlmostFibonacciKnapsack {


	/**
	 * greedily assigning biggest possible number except when A[j] == x-1 as there is no 1 exist in serie
	 * this is true according to the editorial. This is known to be true for fibonacci (Zeckendorf’s theorem) this is also
	 * similar but proof needed.
	 */
	long [] A = new long[90];
	public int[] getIndices(long x)
	{
		A[1] = 2;
		A[2] = 3;
		List<Integer> l = new ArrayList<Integer>();
		for(int i = 3 ; i < A.length ; i ++)
		{
			A[i] = A[i-1] + A[i-2] -1;
//			p(i + " " +A[i] + ""  + (A[i] > (long)Math.pow(10 , 18)));
		}
		for(int j = A.length-1 ; j > 0 ; j --){
			if( A[j] <= x && A[j] != x-1 ) {
				x-=A[j];
				l.add(j);
			}
		}
		if(l.size() == 0)
			return new int[] {-1};
		int ret[] = new int [l.size()];
		for(int i = 0 ; i < l.size(); i ++)
			ret[i] = l.get(i);
		return ret;
	}
	void p(String s){
		System.out.println(s);
	}
}
