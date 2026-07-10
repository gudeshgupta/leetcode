class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>st=new Stack<>();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if(st.isEmpty()){
                st.push(curr);
                continue;
            }
            if(st.peek()==curr){
                st.pop();
                continue;
            }
            st.push(curr);
        }
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        return res.reverse().toString();
    }
}