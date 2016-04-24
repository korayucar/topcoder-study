import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ColorfulGardenHard {

	long modulo = 1000000007;
	Map<String , Long> map ;
	int length ;
	String forbid;
	public int count(String garden, String forbid) {

		this.forbid = forbid;
		map = new HashMap<String, Long>();
		length = garden.length();
		int[] base = new int[26];
        for(int i = 0 ; i < 26 ; i ++)
		    map.put(arrToString((char)(i+97),base),1l);
        map.put(arrToString('0',base),1l);

		int[] initial = new int[26];
		for(int i = 0 ; i < length ; i ++)
			initial[garden.charAt(i)-97]++;
//		rec(initial,0);
        rec(initial,0 , '0');
		return (int) (  rec(initial,0 , '0') %modulo);
	}

	public long rec( int[] in , int depth , char prev)
	{

		long ret = 0l;
		for(int i = 0 ; i < in.length ; i++)
		{
			if(in[i] > 0 && forbid.charAt(depth) -97 != i  && prev-97 != i)
			{
				int[] remaining = Arrays.copyOf(in,in.length);
				remaining[i]--;
				String repr = arrToString(prev,remaining);
				if(map.containsKey( repr))
				{
					ret+=map.get(repr) % modulo;
				}
				else {
					long ll = rec(remaining, depth + 1 , (char) (i+97));
					map.put(repr,ll);
					ret += ll % modulo;
				}
				ret = ret%modulo;
			}
		}
		return ret%modulo;

	}

	private String arrToString(char prev , int[] remaining)
	{
		String ret = "" + prev;
		for(int i : remaining)
			ret+= (char)(i+48);
		return ret;
	}
}
