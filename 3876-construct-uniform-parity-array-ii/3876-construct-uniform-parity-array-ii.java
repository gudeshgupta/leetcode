class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        
        int meven=Integer.MAX_VALUE;
        int modd=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(nums1[i]%2==0)
            meven=Math.min(meven,nums1[i]);
            else
            modd=Math.min(modd,nums1[i]);
        }

        if(meven==Integer.MAX_VALUE||modd==Integer.MAX_VALUE)
        return true;

        if(modd>meven)
        return false;

        return true;
}
}