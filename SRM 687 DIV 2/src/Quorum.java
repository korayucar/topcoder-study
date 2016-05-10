import java.util.Arrays;

public class Quorum {
	
	public int count(int[] arr, int k) {

		Arrays.sort(arr);
		int ret = 0;
		for(int i = 0 ; i < k ; i ++)
			ret +=arr[i];
		return ret;
	}
}
