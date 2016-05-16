import java.util.Arrays;

public class ThreeColorabilityEasy {
	 
	public String isColorable(String[] cells) {
		int H = cells.length;
		int W = cells[0].length();
		int [][]lattice = new int[H+1][W+1];
		for(int i = 0 ; i < H+1 ; i ++)
		{
			for(int j = 0 ; j < W+1 ; j++)
			{
				boolean [] forbidden = new boolean[4];
				if(i ==0 && j ==0) {
					lattice[i][j] = 1;
					continue;
				}

				if (j>0 )
					forbidden[lattice[i][j-1] -1 ] = true;
				if (i>0)
					forbidden[lattice[i-1][j] -1 ] = true;
				if(i == 0 && j>=2)
					forbidden[lattice[i][j-2] -1 ] = true;
				if(j == 0 && i==2)
					forbidden[lattice[i-2][j] -1 ] = true;
				if(i>0 && j > 0 && cells[i-1].charAt(j-1) == 'N')
					forbidden[lattice[i-1][j-1] -1 ] = true;
				if(i>0  && j <W && cells[i-1].charAt(j) == 'Z')
					forbidden[lattice[i-1][j+1] -1 ] = true;

				for (int z = 0 ; z < 3 ; z ++)
					if(!forbidden[z]) {
						lattice[i][j] = z+1;
						break;
					}
				if(lattice[i][j] == 0)
					return "No";
			}
		}
		for (int i = 0 ; i < H+1 ; i++)
			System.out.println(Arrays.toString(lattice[i]));
		return "Yes";
	}
}
