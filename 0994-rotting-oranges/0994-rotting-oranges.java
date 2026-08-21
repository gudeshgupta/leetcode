class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<int[]>pq = new LinkedList<>();
        int time=0;
        int fresh=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    pq.offer(new int[]{i,j});
                    grid[i][j]=-2;
                }else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        while(!pq.isEmpty() && fresh>0){
            time++;
            int s=pq.size();
           while(s-->0){
              int[]p=pq.poll();
             int r=p[0];
             int c=p[1];
             for(int k=0;k<4;k++){
                int row=r+x[k];
                int col=c+y[k];
                if(valid(row,col,n,m)&& grid[row][col]==1){
                    pq.offer(new int[]{row,col});
                    grid[row][col]=-2;
                    fresh--;
                }
             }
           }
        }
        if(fresh>0)
        return -1;
        return time;
    }
    int[] x={-1,1,0,0};
    int[] y={0,0,-1,1};
    boolean valid(int i,int j,int n,int m){
        if(i>=n||i<0||j>=m||j<0)
        return false;
        return true;
    }
    
}