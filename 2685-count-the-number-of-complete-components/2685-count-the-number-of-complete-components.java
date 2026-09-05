class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int c=0;
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        boolean[] vis=new boolean[n];
        for(int i=0;i<edges.length;i++){
            int s=edges[i][0];
            int d=edges[i][1];
            adj.get(s).add(d);
            adj.get(d).add(s);
        }
        for(int i=0;i<n;i++){
            if(!vis[i]){
               if( bfs(i,adj,vis))
                c++;
            }
        }
        return c;
    }
    boolean bfs( int start,ArrayList<ArrayList<Integer>> adj,boolean[] vis){
        Queue<Integer>pq=new LinkedList<>();
        pq.add(start);
        vis[start]=true;
        int node=0;
        int edges=0;
        while(!pq.isEmpty()){
            int curr=pq.poll();
            node++;
            edges+=adj.get(curr).size();
            for(int j=0;j<adj.get(curr).size();j++){
                int neigh=adj.get(curr).get(j);
                if(!vis[neigh]){
                    vis[neigh]=true;
                    pq.add(neigh);
                }
            }
        }
        edges=edges/2;
        return edges==node*(node-1)/2;
            
        
    }
}