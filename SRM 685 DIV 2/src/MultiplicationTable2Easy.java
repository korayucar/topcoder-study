import java.util.Arrays;

public class MultiplicationTable2Easy {
	 
	public String isGoodSet(int[] table, int[] t) {
		int n = (int) Math.sqrt(table.length);
		Arrays.sort(t);
		for(int i = 0 ; i < t.length ; i++)
			for(int j = 0 ; j < t.length ; j++)
				if(Arrays.binarySearch(t , table[t[i]*n+t[j]]) < 0) {
					return "Not Good";
				}
		return "Good";
	}
}
