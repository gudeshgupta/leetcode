class Solution {
    public void setZeroes(int[][] matrix) {
       int n=matrix.length;
       int m=matrix[0].length;
       List<Integer> r=new ArrayList<>();
       List<Integer> c =new ArrayList<>();
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(matrix[i][j]==0){
                r.add(i);
                c.add(j);
            }
        }
       } 
       for(int i=0;i<r.size();i++){
        int row=r.get(i);
        int col=c.get(i);
        for(int j=0;j<m;j++){
            matrix[row][j]=0;
        }
        for(int k=0;k<n;k++){
            matrix[k][col]=0;
        }
       }

    //    return matrix;
       


    }
}