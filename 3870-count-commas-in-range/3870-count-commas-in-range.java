class Solution {
    public int countCommas(int n) {
        if(n<1000)
        return 0;
        int c=0;
        if(n<=99999){
            // c=99999-n+1;
            for(int i=1000;i<=n;i++){
                c++;
            }
            
        }
        if(n>=100000 ){
            for(int i=1000;i<100000;i++){
                c++;
            }
            for(int i=100000;i<=n;i++){
                c++;
            }
        }
        return c;
        // if(n<999999)
    }
}