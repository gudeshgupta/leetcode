class Solution {
    boolean res=true;
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int[] colour=new int[n];
        Arrays.fill(colour,-1);
        for(int i=0;i<n;i++){
            if(colour[i]==-1){
                dfs(graph,i,0,colour);
            }
        }
        return res;
    }
    void dfs(int[][] graph,int node,int c,int[] colour){
        colour[node]=c;
        for(int j=0;j<graph[node].length;j++){
            int neigh=graph[node][j];
            if(colour[neigh]!=-1 && colour[neigh]==c){
                res=false;
            }
            if(colour[neigh]==-1){
                dfs(graph,neigh,1-c,colour);
            }
            
        }
    }
}