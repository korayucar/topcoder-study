import java.util.Arrays;

public class Istr {
	
	public int count(String s, int k) {
		int [] count = new int[26];
		for (char c : s.toCharArray())
			count[c-'a']++;
		while(k > 0) {
			Arrays.sort(count);
			count[25]--;
			k--;
		}
		int ret = 0;
		for(int i : count)
			ret+=i*i;
		return ret;
	}
}
