class Solution {
    public int minReorder(int n, int[][] connections) {
        ArrayList<ArrayList<int[]>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<connections.length;i++){
            
            int s=connections[i][0];
            int d=connections[i][1];

            adj.get(s).add(new int[]{d,1});
            adj.get(d).add(new int[]{s,0});
        }
        return bfs(adj,n);
    }
    int bfs(ArrayList<ArrayList<int[]>> adj,int n){
        boolean[] vis=new boolean[n];
        Queue<Integer>pq=new LinkedList<>();
        int c=0;
        pq.add(0);
        vis[0]=true;
        while(!pq.isEmpty()){
            int node=pq.poll();
            for(int i=0;i<adj.get(node).size();i++){
                int[] edge=adj.get(node).get(i);
                int neigh=edge[0];
                int dir=edge[1];
                if(!vis[neigh]){
                    vis[neigh]=true;
                    pq.add(neigh);
                    if(dir==1){
                        c++;
                    }
                }
            }
        }
        return c;
    }
}