class Solution {
    List<String> res = new ArrayList<>();

   
    String[] map = {
        "",     
        "",     
        "abc",  
        "def",  
        "ghi",  
        "jkl",  
        "mno",  
        "pqrs", 
        "tuv",  
        "wxyz"  
    };

    public void fun(String s,int n,int idx, StringBuilder diary){
        if(idx==n){
            res.add(diary.toString());
            return;
        }

        String choice=map[s.charAt(idx)-'0'];
        for(int j=0;j<choice.length();j++){
            diary.append(choice.charAt(j));
            fun(s,n,idx+1,diary);
            diary.deleteCharAt(diary.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return new ArrayList<>();
            
        }
        int idx=0;
            int n=digits.length();
            StringBuilder diary=new StringBuilder();
            fun(digits,n,idx,diary);
            return res;
    }
}