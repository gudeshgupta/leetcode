class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        
        int result=Math.abs(nums[0]);
        for(int i=1;i<nums.length;i++){
            int v1=nums[i];
            int v2=max+nums[i];
            int v3=min+nums[i];
            max=Math.max(v1,v2);
            min=Math.min(v1,v3);
          
            result=Math.max(result,Math.max(max,Math.abs(min)));

        }
        return result;
    }
    
}