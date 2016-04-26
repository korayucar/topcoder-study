import java.math.BigDecimal;

public class SortEstimate {
	
	public double howMany(int c, int time) {
		BigDecimal ttime = BigDecimal.valueOf(time);
		BigDecimal cc = BigDecimal.valueOf(c);
		BigDecimal hi = new BigDecimal(time+100);
		BigDecimal lo = BigDecimal.ZERO;
		BigDecimal granularity = new BigDecimal(0.000000001);
		while( (hi .subtract( lo ) ).compareTo( granularity ) > 0){
			BigDecimal mid = lo.add((hi.subtract(lo)).divide(BigDecimal.valueOf(2.0)));
			//incorrect handling of precision. Even if use of bigdecimal acceptable,
			// conversion back to double required for convenient logarithm function.
			//TODO use precise logarithm function or reorganize the predicate with exponents rather than logarithms
			if(cc.multiply( mid).multiply(BigDecimal.valueOf ( Math.log(mid.doubleValue())/ Math.log(2.0) ) )
					.compareTo( ttime) > 0  ) hi = mid;
			else lo = mid;

		}
		return lo.doubleValue();
	}



}
