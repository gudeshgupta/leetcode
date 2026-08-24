class Solution {
    public int maximumDifference(int[] nums) {
      int min=nums[0];
      //int max=Integer.MIN_VALUE;
      int diff=-1;
      int n=nums.length;
      for(int i=1;i<n;i++){
        
        if(nums[i]>min){
            diff=Math.max(diff,nums[i]-min);
        }else{
            min=nums[i];
        }
        }
        return diff;
      
     
    }
}