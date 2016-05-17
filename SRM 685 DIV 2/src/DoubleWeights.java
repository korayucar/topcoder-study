import java.util.Arrays;

public class DoubleWeights {

    public int minimalCost(String[] weight1, String[] weight2) {
        int n = weight1.length;
        int[][][] dp = new int[n][n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    dp[i][j][1] = weight1[i].charAt(j) - '0';
                    dp[i][j][2] = weight2[i].charAt(j) - '0';
                    dp[i][j][0] = dp[i][j][1] * dp[i][j][2];
                    if (weight1[i].charAt(j) == '.')
                        Arrays.fill(dp[i][j], 99999);
                }

            }
        }
        for (int z = 0; z < n; z++)
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        int currentCost = dp[i][j][0];
                        int candidatecost = (dp[i][k][1] + dp[k][j][1]) * (dp[i][k][2] + dp[k][j][2]);
                        if (candidatecost < currentCost) {
                            dp[i][j][0] = candidatecost;
                            dp[i][j][1] = dp[i][k][1] + dp[k][j][1];
                            dp[i][j][2] = dp[i][k][2] + dp[k][j][2];

                        }
                    }
                }
            }

        if (dp[0][1][0] == 99999)
            return -1;
        return dp[0][1][0];
    }
}
