class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int l=0;
        int h=height.length-1;
        
        while(l<h){
            int min=Math.min(height[l],height[h]);
             max=Math.max(max,(h-l)*min);
            if(height[l]<height[h]){
                l++;
            }else{
                h--;
            }
        }
        return max;
    }
}