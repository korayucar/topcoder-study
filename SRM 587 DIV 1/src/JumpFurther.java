public class JumpFurther {

	public int furthest(int N, int badStep) {
		int ret = N*(N+1)/2;
		for(int i = 1 ; i <= N ; i++)
			if(i*(i+1) / 2 == badStep)
				return ret-1;
		return ret;
	}
}
