class Solution {
    void fun(int [] a, int n,int idx,ArrayList<Integer> diary,int sum,ArrayList<ArrayList<Integer>>res,int target){

        if(idx==n){
            if(sum==target){
                res.add(new ArrayList<>(diary));
            }
            return;
        }
        fun(a,n,idx+1,diary,sum,res,target);

        if(sum+a[idx]<=target){
            diary.add(a[idx]);
            sum+=a[idx];

            fun(a,n,idx,diary,sum,res,target);
            diary.remove(diary.size()-1);
            sum+=a[idx];
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n=candidates.length;
        int sum=0;
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> diary = new ArrayList<>();
        fun(candidates,n,0,diary,sum,res,target);
        return new ArrayList<>(res);
    }
}