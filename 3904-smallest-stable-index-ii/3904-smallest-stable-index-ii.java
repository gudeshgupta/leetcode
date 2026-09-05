class Solution {
    public int firstStableIndex(int[] nums, int k) {
   int n=nums.length;
        int max[]=new int[n];
        int min[]=new int[n];
        int ma=Integer.MIN_VALUE;
        int mi=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            ma=Math.max(ma,nums[i]);
            max[i]=ma;
        }
        for(int i=n-1;i>=0;i--){
            mi=Math.min(mi,nums[i]);
            min[i]=mi;
        }
        for(int i=0;i<n;i++){
            if(max[i]-min[i]<=k){
                return i;
            }
        }
        return -1;
    }
}