class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int idx=0;
        int idx2=n-1;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                ans[idx]=nums[i];
                idx++;
            }else{
                ans[idx2]=nums[i];
                idx2--;
            }
        }
        return ans;
    }
}