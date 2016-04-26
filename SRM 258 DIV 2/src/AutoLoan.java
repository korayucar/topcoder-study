public class AutoLoan {
	
	public double interestRate(double price, double monthlyPayment, int loanTerm) {


		double hi = 100.0;
		double granularity = 0.0000000000001;
		double lo = 0.0;
		while (hi - lo > granularity)
		{
			double mid = lo + (hi - lo) / 2;
			double remaining = price ;
			for(int i = 0 ; i < loanTerm; i++)
			{
				remaining += remaining * (mid/12);
				remaining -= monthlyPayment;
				if(remaining < 0 ) break;
			}
			if(remaining < 0 ) lo = mid;
			else hi = mid;

		}
		return lo*100;
	}
}
