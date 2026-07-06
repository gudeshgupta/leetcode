class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> temp = new ArrayList<>();
        boolean inserted = false;
        for(int i=0;i<intervals.length;i++){
            if(!inserted&&newInterval[0]<intervals[i][0]){
                temp.add(newInterval);
                inserted=true;
            }
            temp.add(intervals[i]);
        }
        if(!inserted){
            temp.add(newInterval);
        }
        //return temp.toArray(new int[temp.size()][]);
        List<int[]> res = new ArrayList<>();

        for (int i = 0; i < temp.size(); i++) {
            if (res.isEmpty() || res.get(res.size() - 1)[1] < temp.get(i)[0]) {
                res.add(temp.get(i));
            } else {
                res.get(res.size() - 1)[1] =
                    Math.max(res.get(res.size() - 1)[1], temp.get(i)[1]);
            }
        }

        return res.toArray(new int[res.size()][]);
    }
}