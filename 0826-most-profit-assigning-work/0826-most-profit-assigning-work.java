class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int sum=0;
        int n=worker.length;
        int m=difficulty.length;
        
       for(int i=0;i<n;i++){
        int maxprofit=0;
       
        for(int j=0;j<m;j++){
            if(difficulty[j]<=worker[i]){
                maxprofit=Math.max(maxprofit,profit[j]);
             }
            
        }
        sum+=maxprofit;
       }
       return sum;
    }
}