class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        
        
        int idx=-1;
        for(int i=0;i<n;i++){
            int max=nums[0];
           int min=Integer.MAX_VALUE;
            for(int j=0;j<=i;j++){
                max=Math.max(nums[j],max);
            }
            
            for(int a=i;a<n;a++){
                min=Math.min(nums[a],min);
                
            }
            if(max-min<=k){
                idx=i;
                break;
            }
        }
        return idx;
    }
}