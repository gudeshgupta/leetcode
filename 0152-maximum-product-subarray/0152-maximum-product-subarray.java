class Solution {
    public int maxProduct(int[] nums) {
        int res=nums[0];
        int max=nums[0];
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            int v1=nums[i];
            int v2=max*v1;
            int v3=min*v1;
            max=Math.max(v1,Math.max(v2,v3));
            min=Math.min(v1,Math.min(v2,v3));
            res=Math.max(res,Math.max(max,min));
        }
        return res;
    }
}