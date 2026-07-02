class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sum=0;
        int min=nums[0];
        int min2=nums[0];
        int max=nums[0];
        int max2=nums[0];
        for(int i=0;i<nums.length;i++){
           sum+=nums[i];
           if(i==0){
            continue;
           }
           int v1=nums[i];
           int v2=min+nums[i];
           min=Math.min(v1,v2);
           min2=Math.min(min2,min);

           int v3=nums[i];
           int v4=max+nums[i];
           max=Math.max(v3,v4);
           max2=Math.max(max2,max);
       }
        if(max2<0){
            return max2;
        }
        return Math.max(max2,sum-min2);
       
    }
}