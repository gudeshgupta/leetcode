class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int[][] dp=new int[n+1][m+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return fun(text1,text2,n,m,0,0,dp);
    }
    int fun(String s1,String s2,int n,int m,int i,int j,int[][] dp){
        if(i==n || j==m){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        if(s1.charAt(i)==s2.charAt(j)){
            dp[i][j]=1+fun(s1,s2,n,m,i+1,j+1,dp);
        }else{
            dp[i][j]=Math.max(
                fun(s1,s2,n,m,i+1,j,dp),
                fun(s1,s2,n,m,i,j+1,dp)
            );
        }
        return dp[i][j];


    }
}