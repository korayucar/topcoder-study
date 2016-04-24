import java.util.HashSet;
import java.util.Set;

public class NonDeterministicSubstring {
	
	public long ways(String A, String B) {

		Set<String> set = new HashSet<String>();
		for(int i = 0 ; i+B.length() <= A.length() ; i ++ )
		{
			boolean found = true;
			for(int j = 0 ; j < B.length() ; j ++)
				found &= (B.charAt(j) =='?' | B.charAt(j) == A.charAt(i+j));
			if(found)
				set.add(A.substring(i , i+B.length()));
		}
		return set.size();
	}
}
