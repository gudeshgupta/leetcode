class Solution {
    public boolean isPalindrome(int x) {
      int temp=x;
      int res=0;

      while(temp>0){
        int digit=temp%10;
        res=res*10+(digit);
       
        temp=temp/10;
        
      }  
      if(res==x){
        return true;
      }
      return false;
    }
}