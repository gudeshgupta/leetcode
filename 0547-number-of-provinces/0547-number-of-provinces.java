class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        
        boolean[] vis=new boolean[n];

        int c=0;
        for(int i=0;i<n;i++){
            if(!vis[i]){
                c++;
                bfs(i,isConnected,vis);
            }
        }
        return c;

    }
    void bfs(int start,int[][] isConnected,boolean[] vis){
        Queue<Integer>pq=new LinkedList<>();

        pq.add(start);
        vis[start]=true;
        while(!pq.isEmpty()){
            int node=pq.poll();

            for(int j=0;j<isConnected.length;j++){
                if(isConnected[node][j]==1 && !vis[j]){
                    vis[j]=true;
                    pq.add(j);
                }
            }
        }
    }
}