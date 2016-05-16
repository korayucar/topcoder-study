public class JumpFurther {
	/**
	 * can also be done in O(1) time
	 * @param N
	 * @param badStep
	 * @return
     */
	public int furthest(int N, int badStep) {
		int ret = N*(N+1)/2;
		for(int i = 1 ; i <= N ; i++)
			if(i*(i+1) / 2 == badStep)
			 return ret-1;
		return ret;
	}
}
