class Solution {
    public int maximumSum(int[] arr) {
        int keep=arr[0];
        int delete=0;
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            delete=Math.max(delete+arr[i],keep);
            keep=Math.max(keep+arr[i],arr[i]);
            ans=Math.max(ans,Math.max(delete,keep));
        }
        return ans;
    }
}