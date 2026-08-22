class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer>l=new ArrayList<>();
        for(int i=0;i<index.length;i++){
            l.add(index[i],nums[i]);
        }
        int n=l.size();
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=l.get(i);
        }
        return res;
    }
}