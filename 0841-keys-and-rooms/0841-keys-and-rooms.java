class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean[] vis=new boolean[n];
        Queue<Integer>pq=new LinkedList<>();
        pq.add(0);
        vis[0]=true;
        while(!pq.isEmpty()){
            int room=pq.poll();

            for(int j=0;j<rooms.get(room).size();j++){
                int neigh=rooms.get(room).get(j);
                if(!vis[neigh]){
                    vis[neigh]=true;
                    pq.add(neigh);
                }
            }
        }
        for(int i=0;i<n;i++){
            if(!vis[i])
            return false;
        }
        return true;
    }
}