class Solution {
    public List<Integer> findLonely(int[] nums) {
     
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
List<Integer>l=new ArrayList<>();
        for(int num:nums){
            if(map.get(num)==1&&!map.containsKey(num-1)&&!map.containsKey(num+1)){
                l.add(num);
            }
        }

        
        return l;
    }
}