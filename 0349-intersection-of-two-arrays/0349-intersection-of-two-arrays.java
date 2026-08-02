class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>ans=new HashSet<>();
        HashSet<Integer>res=new HashSet<>();
       for(int num:nums1){
        ans.add(num);
       }
       for(int num:nums2){
        if(ans.contains(num)){
            res.add(num);
        }
       }
       int[] f=new int[res.size()];
       int i=0;
       for(int num:res){
        f[i++]=num;
       }
       return f;
    }
}