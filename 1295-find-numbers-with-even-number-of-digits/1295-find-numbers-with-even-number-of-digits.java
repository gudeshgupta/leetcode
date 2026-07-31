class Solution {
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int d=0;
       
        int ans=0;
        for(int i=0;i<n;i++){
             int c=0;
            d=nums[i];
            while(d>0){
                d=d/10;
                c++;
            }
            if(c%2==0){
                ans++;
            }
        }
        return ans;
    }
}