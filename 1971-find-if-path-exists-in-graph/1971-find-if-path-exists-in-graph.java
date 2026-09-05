class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[] vis=new boolean[n];
        ArrayList<ArrayList<Integer>> adj =new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int s=edges[i][0];
            int d=edges[i][1];
            adj.get(s).add(d);
            adj.get(d).add(s);

        }
        Queue<Integer> q = new LinkedList<>();

        q.add(source);
        vis[source] = true;

        while(!q.isEmpty()) {

            int node = q.poll();

            if(node == destination)
                return true;

            for(int j = 0; j < adj.get(node).size(); j++) {

                int neigh = adj.get(node).get(j);

                if(!vis[neigh]) {

                    vis[neigh] = true;
                    q.add(neigh);
                }
            }
        }

        return false;
 
    }
}