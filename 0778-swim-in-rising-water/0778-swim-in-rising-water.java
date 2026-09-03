class Solution {
    public int swimInWater(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        int[][] res=new int[n][m];
        for(int i=0;i<n;i++){
           
            Arrays.fill(res[i],Integer.MAX_VALUE);
            
        }

      PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[0], b[0])
        );
  
        int[] x={1,-1,0,0};
        int[] y={0,0,1,-1};
        res[0][0]=grid[0][0];
        pq.add(new int[] {grid[0][0],0,0});

        while(!pq.isEmpty()){
            int[]p=pq.poll();
            int dis=p[0];
            int row=p[1];
            int col=p[2];

            if(row==n-1 && col==m-1){
                return dis;
            }

            for(int k=0;k<4;k++){
                int r=row+x[k];
                int c=col+y[k];

                if(r<0 || r>=n || c<0 || c>=m)
                continue;

                // nt adsdiff=Math.abs(grid[row][col]-grid[r][c]);
                int newWt=Math.max(grid[r][c],dis);
                if(newWt<res[r][c]){
                    res[r][c]=newWt;
                    pq.add(new int[]{newWt,r,c});
                }
            }
        }
        return -1;
    }
}