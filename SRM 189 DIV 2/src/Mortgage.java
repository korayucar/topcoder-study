public class Mortgage {


    /**
     * 1000 problem div 2
     * @param loan
     * @param interest
     * @param term
     * @return
     */
	public int monthlyPayment(int loan, int interest, int term) {
		long hi = loan;
		long lo = 0;
        term *=12;
		while (hi - lo > 1)
		{
			long mid =  lo + (hi-lo)/2;
			long  total = loan;
			double interestcoefficient = Double.valueOf(interest + 12000)/12000.0;
			for ( int i = 0 ; i < term ; i ++){
				total -= mid;
                //not the use of break here. A pitfall here is that to assume continuing with negative debt is not harmful.
                // Once you paid all debt negative long values may overflow with very high interest.
                //Obviously necessary to break.
                if(total <= 0 )break;
				total =  Double.valueOf( Math.ceil(total*interestcoefficient)).longValue();
			}
			if(total<=0.0) hi = mid;
			else lo = mid;
		}
		return (int)hi;
	}
}
