class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        
        int[][] dp=new int[n][n+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return fun(nums,n,0,-1,dp);
    }
    int fun(int[] a,int n,int i,int prev,int[][] dp){
        if(i==n)
        return 0;

        if(dp[i][prev+1]!=-1)
        return dp[i][prev+1];

        if(prev==-1 || a[i]>a[prev]){
            int c1=1+fun(a,n,i+1,i,dp);
            int c2=fun(a,n,i+1,prev,dp);
            return dp[i][prev+1]=Math.max(c1,c2);
        }
        return dp[i][prev+1]=fun(a,n,i+1,prev,dp);
    }
}