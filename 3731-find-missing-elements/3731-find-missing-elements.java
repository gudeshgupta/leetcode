class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
       
        boolean[] present = new boolean[max - min + 1];

        for(int i=0;i<n;i++){
            present[nums[i]-min]=true;
        }
        for(int i=0;i<present.length;i++){
            if(!present[i]){
                ans.add(i+min);
            }
        }
        return ans;
       

       
    }
}