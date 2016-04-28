import java.util.Arrays;

public class ZigZag {
	
	public int longestZigZag(int[] sequence) {
		int length = sequence.length;
		//initialize the states for the best sequences found for each element in sequence excluding the element itself
		//for brevity
		int [] bestSequenceLastIncreased = new int[length];
		int [] bestSequenceLastDecreased = new int[length];
		//do the dynamic iteration
		for(int i = 0 ; i < length ; i ++)
			for(int j = 0 ; j < i ; j ++)
				if(sequence[i] > sequence[j])
					bestSequenceLastIncreased[i] = Math.max(bestSequenceLastIncreased[i] , bestSequenceLastDecreased[j] + 1);
				else if(sequence [i] < sequence[j])
					bestSequenceLastDecreased[i] = Math.max(bestSequenceLastDecreased[i] , bestSequenceLastIncreased[j] + 1);
		//no harm done being a bit lazy. All we need is the maximum of the two arrays.
		Arrays.sort(bestSequenceLastIncreased);
		Arrays.sort(bestSequenceLastDecreased);
		//remmember we omited element itself from search thus add one
		return Math.max(bestSequenceLastDecreased[length-1] , bestSequenceLastIncreased[length-1]) + 1;
	}
}
