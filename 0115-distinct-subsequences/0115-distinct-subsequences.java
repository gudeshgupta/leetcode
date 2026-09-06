class Solution {

    int[][] dp;

    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();

        dp = new int[n][m];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return solve(s, t, 0, 0);
    }

    public int solve(String s, String t, int i, int j) {

        if (j == t.length()) {
            return 1;
        }

        if (i == s.length()) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        if (s.charAt(i) == t.charAt(j)) {

            int take = solve(s, t, i + 1, j + 1);

            int notTake = solve(s, t, i + 1, j);

            dp[i][j] = take + notTake;

        } else {

            dp[i][j] = solve(s, t, i + 1, j);
        }

        return dp[i][j];
    }
}