public class Queueing {

	/**
	 * solution taken from topcoder editorial
	 *
	 * observe that the given function is binomial distribution with probablity 1/p
	 *
	 * define f(len1,len2) that gives the probability that first line with len1 ustomer will finish before
	 * second line with len2 customers.
	 *
	 * f(nonzero , zero ) = 0 since the second line is finished already
	 * f(zero , nonzero)  = 1 since the first line finished already
	 *
	 * then there can occur different events at each moment
	 *
	 * With probability q1⋅q2q1⋅q2, both queues decrease in size. So the probability that the first queue
	 * 						will finish before the other given this is: f(a−1,b−1)f(a-1,b-1).
	 * With probability q1⋅(1−q2)q1⋅(1-q2) only the second queue decreases: f(a,b−1)f(a,b-1).
	 * With probability (1−q1)⋅q2(1-q1)⋅q2 only the first queue decreases: f(a−1,b)f(a-1,b).
	 * With probability (1−q1)⋅(1−q2)(1-q1)⋅(1-q2) both stay the same: f(a,b)f(a,b).
	 *
	 *
	 * @param len1
	 * @param len2
	 * @param p1
	 * @param p2
     * @return
     */

	double [][] f = new double [1001][1001];

	public double probFirst(int len1, int len2, int p1, int p2) {

		double q1 = ( (double)1.0 ) / p1;
		double q2 = ( (double)1.0 ) / p2;

		for(int i = 0 ; i <= len1 ; i ++){
			for(int j = 0 ; j <= len2 ; j ++){
				if(j == 0 ) // this must come first since if they are both
					// zero at the same time it does not count by problem statement
					f[i][j] = 0;
				else if(i == 0)
					f[i][j] = 1.0;
				else
				{
					double s = (1-q1) * (1-q2);
					double r = 0.0;
					//add the probablity that both are increased
					r += q1 * q2 * f[i-1][j-1];
					//add probability that second line improves first line passes
					r += (1.0-q1) * q2 * f[i][j-1];
					//add probability that only first line increase
					r += (q1) * (1-q2) * f[i-1][j];
					//at this point f(i,j) = r + sf(i,j) then solve for f(i,j)
					f[i][j] = r/(1-s);


				}
			}
		}
		return f[len1][len2];
	}
}
