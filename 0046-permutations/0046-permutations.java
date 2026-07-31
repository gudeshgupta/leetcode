class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int n=nums.length;
        boolean[] used=new boolean[n];
        ArrayList<Integer> diary=new ArrayList<>();
        List<List<Integer>>res=new ArrayList<>();
        fun(nums,n,used,diary,res);
        return res;
    }
    void fun(int[] nums,int n, boolean[] used,ArrayList<Integer>diary,List<List<Integer>>res){
        if(diary.size()==n){
            res.add(new ArrayList<>(diary));
            return;
        }
       
        for(int i=0;i<n;i++){
            if(used[i])
            continue;

            diary.add(nums[i]);
            used[i]=true;

            fun(nums,n,used,diary,res);

            diary.remove(diary.size()-1);
            used[i]=false;
        }
    }
}