class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            int[] a=nums1[i];
            map.put(a[0],a[1]);
        }
        for(int i=0;i<nums2.length;i++){
            int[] a=nums2[i];
            map.put(a[0],map.getOrDefault(a[0],0)+a[1]);
        }
        ArrayList<int[]> res=new ArrayList<>();
       
    for (int id : map.keySet()) {
    res.add(new int[]{id, map.get(id)});
    }
        res.sort((a,b)->a[0]-b[0]);
        return res.toArray(new int[res.size()][]);
    }
}