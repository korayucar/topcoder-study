public class Autohamil {


    /**
     * According to editorial :
     *
     * there is an assumption that if there is a path from a node to another back or forth is
     * the necessary and sufficient condition need to think on this. Not obvious to me.
     *
     * Simple floyd warshall is the solution then.
     * @param z0
     * @param z1
     * @return
     */
    public String check(int[] z0, int[] z1) {
        // create the graph from input, adjacency matrix:
        int n = z0.length;
        int[][] a = new int [n][n];

        for (int i = 0; i < n; i++) {
            a[i][z0[i]] = 1;
            a[i][z1[i]] = 1;
        }

        // Floyd-Warshall to quickly get which vertices are reachable from which starting points:
        int[][]  d = a;
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    d[i][j] |= (d[i][k] & d[k][j]);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (i != 0 && d[0][i] == 0 ) {
                return "Does not exist";
            }
            for (int j = 0; j < n; j++) {
                if ((i != j) && 0==d[i][j] && 0==d[j][i]) {

                    return "Does not exist";
                }
            }
        }
        return "Exists";


    }
}
