class Solution {
    class pair{
        int first;
        int second;
        pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        PriorityQueue<pair>pq=new PriorityQueue<>(
            (a,b)->{
                return a.second-b.second;
            });
            for(int num:nums){
                map.put(num,map.getOrDefault(num,0)+1);
            }
            for(int key:map.keySet()){
               if(pq.size()<k){
                 pq.add( new pair(key,map.get(key)));
               }else{
                if(map.get(key)>pq.peek().second){
                    pq.poll();
                     pq.add( new pair(key,map.get(key)));
                }
               }
            }
            int[] res=new int[k];
            for(int i=0;i<k;i++){
                res[i]=pq.poll().first;
            }
            return res;
        
    }
}