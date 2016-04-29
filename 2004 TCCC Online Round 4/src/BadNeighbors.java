import java.util.Arrays;

public class BadNeighbors {
	
	public int maxDonations(int[] donations) {
		//get rid of some corner cases  since problem is trivial when there is only a few houses
		if(donations.length <=3 ) {
			Arrays.sort(donations);
			return donations[donations.length-1];
		}

		//create one array representing the case where firs house is involved
		int [] data = Arrays.copyOf(donations , donations.length);
		data[1]= 0;
		data[2]+=data[0];
		data[donations.length-1] = 0;
		//create another where first house is not involved
		int [] data2 = Arrays.copyOf(donations , donations.length);
		data2[0] = 0;
		//calculate dynamically the maximum amount up to each house can be collected
		data = rec(3 , Arrays.copyOf(data,donations.length) );
		data2 = rec(3 , Arrays.copyOf(data2,donations.length) );
		//get and return the maximum of both arrays
		Arrays.sort(data );
		Arrays.sort(data2 );
		return Math.max (
				data[donations.length-1 ],
				data2[donations.length-1 ]

		);

	}

	int[] rec(int index , int []data)
	{
		for (int i = index ; i < data.length ; i ++)
			data[i] += Math.max(data[i-2 ] , data[i-3]);
		return data;
	}
}
