class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        HashSet<Integer> hp=new HashSet<>();
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                hp.add(nums[i]);
                min=Math.min(min,nums[i]);
            }
        }

        if(min!=1)
        return 1;

        while(true){
            if(!hp.contains(min+1)){
                return min+1;
            }
            min=min+1;
        }

        
        
        


    }
}