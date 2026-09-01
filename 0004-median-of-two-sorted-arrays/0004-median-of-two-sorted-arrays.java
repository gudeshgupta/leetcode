class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] ans=new int[n+m];
        System.arraycopy(nums1, 0, ans, 0, n);
        System.arraycopy(nums2, 0, ans, n,m);
        Arrays.sort(ans);
        double res=0;
        
        if(ans.length%2==0){
            int mid=ans.length/2;
            res=ans[mid-1]+ans[mid];
            res=res/2;
        }else{
        int mid=ans.length/2;
        res=ans[mid];
        }

        return res;
    }
}