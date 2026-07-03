class Solution {
    public int subarraySum(int[] nums, int k) {
        int res=0;
        int sum=0;
        int n=nums.length;
        
        HashMap<Integer,Integer>f=new HashMap<>();
        f.put(0,1);
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int que=sum-k;
            res+=f.getOrDefault(que,0);
            f.put(sum,f.getOrDefault(sum,0)+1);

        }
        return res;
    }
}