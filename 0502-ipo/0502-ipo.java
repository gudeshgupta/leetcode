class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        // ArrayList<Integer,Integer> pro=new ArrayList<>();
        int n=profits.length;
        int[][] pro=new int [n][2];
        for(int i=0;i<n;i++){
            pro[i][0]=capital[i];
            pro[i][1]=profits[i];
        } 
        Arrays.sort(pro, (a, b) -> Integer.compare(a[0], b[0]));
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        int idx=0;
        while(k-->0){
            while(idx<n){
                if(pro[idx][0]>w){
                    break;
                }
                pq.add(pro[idx][1]);
                idx++;
            }
            if(pq.isEmpty()){
                return w;
            }else{
                w=w+pq.peek();
                pq.poll();
            }
        }
        return w;
    }
}