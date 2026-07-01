class Solution {
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        while(fast!=1){
            slow=nextgen(slow);

            fast=nextgen(nextgen(fast));
            if(slow==fast&&slow!=1){

           return false;
        }
        }
        
        
        return true;


    }
    public int nextgen(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum=sum+digit*digit;
            n=n/10;
        }
        return sum;
    }
}