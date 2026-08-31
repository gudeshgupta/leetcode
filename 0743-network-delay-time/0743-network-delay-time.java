class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int V=n;
        int src=k-1;
         ArrayList<ArrayList<int[]>> adj= new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<times.length;i++){
            //int []e=times[i];
            int s=times[i][0];
            int d=times[i][1];
            int wt=times[i][2];
            
            adj.get(s-1).add(new int[]{d-1,wt});
           // adj.get(d).add(new int[]{s,wt});
        }
        
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)-> a[0]-b[0]);
        int[] dist=new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        
        dist[src]=0;
        pq.add(new int[]{0,src});
        
        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            int d=curr[0];
            int node=curr[1];
            
            if(d>dist[node])
            continue;
            
            for(int i=0;i<adj.get(node).size();i++){
                int[] edge=adj.get(node).get(i);
                int neigh=edge[0];
                int wt=edge[1];
                
                if(d+wt<dist[neigh]){
                    dist[neigh]=d+wt;
                    pq.add(new int[]{dist[neigh],neigh});
                }
            }
        }
        int max=0;
        for(int i=0;i<dist.length;i++){
            max=Math.max(max,dist[i]);
        }
        if(max==Integer.MAX_VALUE)
        return -1;

        return max;
    }
}