import java.util.Arrays;

public class UnionOfIntervals {
	
	public int nthElement(int[] low, int[] up, int nn) {

		long offset = 2000000000;
		long [] lowerBound = new long[low.length];
		long [] upperBound = new long[low.length];
		for (int i = 0 ; i < low.length ; i ++)
		{
			lowerBound[i] = low[i] + offset;
			upperBound[i] = up[i] + offset;
		}
		long n = nn;
		long hi =  4000000000l;
		long lo = 0;
		while (hi  - lo > 1)
		{
			long mid  = lo + (hi-lo) / 2;
			long limit = n +1;
			for (int i = 0 ; i < lowerBound.length ; i++)
			{
				if(mid >= lowerBound[i])
				{
					limit --;
					limit -= (Math.min(mid , upperBound[i] )-lowerBound[i]);
				}
			}
			if(limit <= 0)hi = mid;
			else lo = mid;

		}
		long ret = 0;
		//if the found number is in one of the intervals it is the answer
		for (int i = 0 ; i < lowerBound.length ; i++)
		{
			if(hi>= lowerBound[i] && lo <= upperBound[i])
			{
				ret = hi;
				return (int)(ret-offset);
			}
		}
		Arrays.sort(lowerBound);
		for(long  i : lowerBound)
			if(i > hi)
				ret = i;
		return (int)(ret-offset);
	}
}
